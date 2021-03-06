/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
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
package test.css.controls.functional;

import org.junit.Test;
import client.test.Keywords;
import client.test.Smoke;
import org.junit.BeforeClass;
import org.junit.Before;
import test.javaclient.shared.TestBase;
import static test.css.controls.ControlPage.ComboBoxes;
import test.javaclient.shared.screenshots.ScreenshotUtils;

/**
 * Generated test
 */
public class ComboBoxesCssTest extends TestBase {

    {
        ScreenshotUtils.setComparatorDistance(0.003f);
    }

    @BeforeClass
    public static void runUI() {
        test.css.controls.ControlsCSSApp.main(null);
    }

    @Before
    public void createPage () {
        ((test.css.controls.ControlsCSSApp)getApplication()).open(ComboBoxes);
    }

    /**
     * test  ComboBoxe with css: -fx-background-color
     */
    @Test
    public void ComboBoxes_BACKGROUND_COLOR() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-COLOR", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-image
     */
    @Test
    public void ComboBoxes_BACKGROUND_IMAGE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-IMAGE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-inset
     */
    @Test
    public void ComboBoxes_BACKGROUND_INSET() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-INSET", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-position
     */
    @Test
    public void ComboBoxes_BACKGROUND_POSITION() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-POSITION", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-repeat-round
     */
    @Test
    public void ComboBoxes_BACKGROUND_REPEAT_ROUND() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-REPEAT-ROUND", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-repeat-space
     */
    @Test
    public void ComboBoxes_BACKGROUND_REPEAT_SPACE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-REPEAT-SPACE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-repeat-x-y
     */
    @Test
    public void ComboBoxes_BACKGROUND_REPEAT_X_Y() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-REPEAT-X-Y", true);
    }

    /**
     * test  ComboBoxe with css: -fx-background-size
     */
    @Test
    public void ComboBoxes_BACKGROUND_SIZE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BACKGROUND-SIZE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-blend-mode
     */
    @Test
    public void ComboBoxes_BLEND_MODE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BLEND-MODE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-color
     */
    @Test
    public void ComboBoxes_BORDER_COLOR() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-COLOR", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-inset
     */
    @Test
    public void ComboBoxes_BORDER_INSET() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-INSET", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-style-dashed
     */
    @Test
    public void ComboBoxes_BORDER_STYLE_DASHED() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-STYLE-DASHED", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-style-dotted
     */
    @Test
    public void ComboBoxes_BORDER_STYLE_DOTTED() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-STYLE-DOTTED", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-width
     */
    @Test
    public void ComboBoxes_BORDER_WIDTH() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-WIDTH", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-width-dashed
     */
    @Test
    public void ComboBoxes_BORDER_WIDTH_dashed() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-WIDTH-dashed", true);
    }

    /**
     * test  ComboBoxe with css: -fx-border-width-dotted
     */
    @Test
    public void ComboBoxes_BORDER_WIDTH_dotted() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "BORDER-WIDTH-dotted", true);
    }

    /**
     * test  ComboBoxe with css: -fx-drop-shadow
     */
    @Test
    public void ComboBoxes_DROP_SHADOW() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "DROP_SHADOW", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-insets
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_INSETS() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-INSETS", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-no-repeat
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_NO_REPEAT() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-NO-REPEAT", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-repeat-x
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_REPEAT_X() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-REPEAT-X", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-repeat-y
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_REPEAT_Y() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-REPEAT-Y", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-round
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_ROUND() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-ROUND", true);
    }

    /**
     * test  ComboBoxe with css: -fx-image-border-space
     */
    @Test
    public void ComboBoxes_IMAGE_BORDER_SPACE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "IMAGE-BORDER-SPACE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-inner-shadow
     */
    @Test
    public void ComboBoxes_INNER_SHADOW() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "INNER_SHADOW", true);
    }

    /**
     * test  ComboBoxe with css: -fx-opacity
     */
    @Test
    public void ComboBoxes_OPACITY() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "OPACITY", true);
    }

    /**
     * test  ComboBoxe with css: -fx-padding
     */
    @Test
    public void ComboBoxes_PADDING() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "PADDING", true);
    }

    /**
     * test  ComboBoxe with css: -fx-position-scale-shape
     */
    @Test
    public void ComboBoxes_POSITION_SCALE_SHAPE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "POSITION-SCALE-SHAPE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-rotate
     */
    @Test
    public void ComboBoxes_ROTATE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "ROTATE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-scale-shape
     */
    @Test
    public void ComboBoxes_SCALE_SHAPE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "SCALE-SHAPE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-scale-x
     */
    @Test
    public void ComboBoxes_SCALE_X() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "SCALE-X", true);
    }

    /**
     * test  ComboBoxe with css: -fx-scale-y
     */
    @Test
    public void ComboBoxes_SCALE_Y() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "SCALE-Y", true);
    }

    /**
     * test  ComboBoxe with css: -fx-shape
     */
    @Test
    public void ComboBoxes_SHAPE() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "SHAPE", true);
    }

    /**
     * test  ComboBoxe with css: -fx-snap-to-pixel
     */
    @Test
    public void ComboBoxes_SNAP_TO_PIXEL() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "SNAP-TO-PIXEL", true);
    }

    /**
     * test  ComboBoxe with css: -fx-translate-x
     */
    @Test
    public void ComboBoxes_TRANSLATE_X() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "TRANSLATE-X", true);
    }

    /**
     * test  ComboBoxe with css: -fx-translate-y
     */
    @Test
    public void ComboBoxes_TRANSLATE_Y() throws Exception {
       testAdditionalAction(ComboBoxes.name(), "TRANSLATE-Y", true);
    }



    public String getName() {
        return "ControlCss";
    }
}
