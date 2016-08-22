/*
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package javafx.scene.control.test.treetable;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.test.tableview.ApplicationInteractionFunctions;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jemmy.control.Wrap;
import org.jemmy.env.Timeout;
import org.jemmy.image.AWTImage;
import org.jemmy.timing.Waiter;
import org.junit.Test;
import static com.sun.javafx.application.PlatformImpl.runAndWait;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Bounds;
import org.jemmy.fx.Root;

/**
 * @author Andrey Rusakov
 */
public class CommonTreeTableTest extends ApplicationInteractionFunctions {

    static {
        isTableTests = false;
    }

    private static final double COLOR_TRESHOLD = 0.01;
    private static final long COLOR_TIMEOUT = 3000l;

    //Yes. Jemmy really uses RBGA, not RGBA (see AWTImage.getSupported)
    private static double getColorDistance(Color fxColor, double[] rbg) {
        return Math.sqrt((fxColor.getRed() - rbg[0]) * (fxColor.getRed() - rbg[0])
                + (fxColor.getGreen() - rbg[2]) * (fxColor.getGreen() - rbg[2])
                + (fxColor.getBlue() - rbg[1]) * (fxColor.getBlue() - rbg[1]));
    }

    private void waitForColor(Wrap wrap, int x, int y, Color expectedColor) {
        new Waiter(new Timeout("Waiting for pixel to be " + expectedColor, COLOR_TIMEOUT))
                .ensureState(() -> {
                    AWTImage image = (AWTImage) wrap.getScreenImage();
                    double[] colors = new double[4];
                    image.getColors(x, y, colors);
                    double dist = getColorDistance(expectedColor, colors);
                    return dist < COLOR_TRESHOLD ? true : null;
                });
    }

    /**
     * 8158784: [TEST BUG] Need test for JDK-8157398
     */
    @Test
    public void testCollapsedNodeGraphicVisible() throws Exception {
        Color nodeColor = new Color(Math.random(), Math.random(), Math.random(), 1);
        TreeTableView treeTable = (TreeTableView) testedControl.getControl();
        TreeItem<String> root = new TreeItem<>("Root Node");
        TreeItem<String> child = new TreeItem<>("Child", new Rectangle(10, 10, nodeColor));
        TreeTableColumn<String, String> column = new TreeTableColumn<>("Column");
        column.setCellValueFactory(item -> new SimpleStringProperty("Whatever"));
        treeTable.getColumns().setAll(column);
        root.getChildren().add(child);
        root.setExpanded(true);
        treeTable.setShowRoot(true);
        runAndWait(() -> {
            treeTable.setRoot(root);
        });
        Wrap nodeGraphic = parent.lookup(node -> node == child.getGraphic()).wrap();
        Wrap sceneWrap = Root.ROOT.lookup().wrap();
        waitForColor(nodeGraphic, 1, 1, nodeColor);
        Bounds graphicBounds = child.getGraphic().localToScene(child.getGraphic().getBoundsInLocal());
        root.setExpanded(false);
        waitForColor(sceneWrap,
                (int) (graphicBounds.getMinX() + graphicBounds.getWidth() / 2),
                (int) (graphicBounds.getMinY() + graphicBounds.getHeight() / 2), Color.WHITE);
    }
}
