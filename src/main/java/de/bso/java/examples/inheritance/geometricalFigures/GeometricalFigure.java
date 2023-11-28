package de.bso.java.examples.inheritance.geometricalFigures;

import java.awt.*;

public abstract class GeometricalFigure {

    protected String color;

    protected int zoom;

    public void setColor(String color) {
        this.color = color;
    }

    public void zoomTo(int zoom) {
        this.zoom = zoom;
    }

    public abstract void draw(Graphics2D g2d);
}
