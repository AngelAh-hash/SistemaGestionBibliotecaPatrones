package org.netbeans.lib.awtextra;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;

/** Minimal replacement for NetBeans AbsoluteConstraints so the project compiles standalone. */
public class AbsoluteConstraints implements Serializable {
    public int x;
    public int y;
    public int width = -1;
    public int height = -1;

    public AbsoluteConstraints(Point pos) {
        this(pos.x, pos.y, -1, -1);
    }

    public AbsoluteConstraints(Point pos, Dimension size) {
        this(pos.x, pos.y, size.width, size.height);
    }

    public AbsoluteConstraints(int x, int y) {
        this(x, y, -1, -1);
    }

    public AbsoluteConstraints(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
