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
package test.scenegraph.fx3d.interfaces;

import javafx.scene.paint.Color;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;

/**
 *
 * @author Andrew Glushchenko
 */
public interface ShapesTestingFace {

    public abstract void setDiffuseMap(boolean bln);

    public abstract void setBumpMap(boolean bln);

    public abstract void setSpecularMap(boolean bln);

    public abstract void setAndUpdateDiffuseMap(boolean bln);

    public abstract void setNullMaterial(boolean bln);

    public abstract void setAndUpdateBumpMap(boolean bln);

    public abstract void setAndUpdateSelfIlluminationMap(boolean bln);

    public abstract void setAndUpdateSpecularMap(boolean bln);

    public abstract String materialToString();

    public abstract void materialConstruct1();

    public abstract void setVisible(boolean bln);

    public abstract void materialConstruct2();

    public abstract void setSpecularPower(double d);

    public abstract void setSpecularColor(Color color);

    public abstract void setDiffuseColor(Color color);

    public abstract void setSelfIllumination(boolean bln);

    public abstract void setDrawMode(DrawMode mode);

    public abstract void setCullFace(CullFace face);

    public abstract void setRotateX(double d);

    public abstract void setRotateY(double d);

    public abstract void setRotateZ(double d);
}
