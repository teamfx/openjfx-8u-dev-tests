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
package javafx.scene.control.test.nchart;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.test.chart.apps.NewAreaChartApp;
import org.junit.BeforeClass;

/**
 * @author Alexander Kirov
 *
 * This class is a part of experimental tests on Charts, which are aimed to
 * replace tests with huge amount of images, and which (probably) could fail at
 * any moment and for unknown reason. They could be fixed or disabled.
 */
public class AreaChartTest extends AreaStackedAreaChartsCommon {

    @BeforeClass
    public static void setUpClass() {
        NewAreaChartApp.main(null);
    }

    @Override
    protected Chart getNewChartInstance() {
        NumberAxis axis1 = new NumberAxis(0, 100, 10);
        NumberAxis axis2 = new NumberAxis(0, 100, 10);
        AreaChart chart = new AreaChart(axis1, axis2);
        return chart;
    }
}