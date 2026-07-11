package org.netbeans.lib.awtextra;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/** Minimal replacement for NetBeans AbsoluteLayout so the project compiles standalone. */
public class AbsoluteLayout implements LayoutManager2, Serializable {
    private final Map<Component, AbsoluteConstraints> constraints = new HashMap<>();

    @Override
    public void addLayoutComponent(Component comp, Object constr) {
        if (constr instanceof AbsoluteConstraints) {
            constraints.put(comp, (AbsoluteConstraints) constr);
        } else {
            constraints.put(comp, new AbsoluteConstraints(0, 0));
        }
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        constraints.put(comp, new AbsoluteConstraints(0, 0));
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        constraints.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int maxX = 0;
        int maxY = 0;
        for (Component c : parent.getComponents()) {
            AbsoluteConstraints ac = constraints.get(c);
            if (ac == null) continue;
            Dimension d = c.getPreferredSize();
            int w = ac.width >= 0 ? ac.width : d.width;
            int h = ac.height >= 0 ? ac.height : d.height;
            maxX = Math.max(maxX, ac.x + w);
            maxY = Math.max(maxY, ac.y + h);
        }
        return new Dimension(maxX, maxY);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override
    public void layoutContainer(Container parent) {
        for (Component c : parent.getComponents()) {
            AbsoluteConstraints ac = constraints.get(c);
            if (ac == null) continue;
            Dimension d = c.getPreferredSize();
            int w = ac.width >= 0 ? ac.width : d.width;
            int h = ac.height >= 0 ? ac.height : d.height;
            c.setBounds(ac.x, ac.y, w, h);
        }
    }

    @Override
    public float getLayoutAlignmentX(Container target) { return 0.5f; }

    @Override
    public float getLayoutAlignmentY(Container target) { return 0.5f; }

    @Override
    public void invalidateLayout(Container target) { }
}
