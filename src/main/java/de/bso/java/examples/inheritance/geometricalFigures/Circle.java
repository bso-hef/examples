package de.bso.java.examples.inheritance.geometricalFigures;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends GeometricalFigure {

    private  Point centerPoint = new Point(150, 150);

    private  int radius = 200;


    public Circle() {
        super();
    }

    public Circle(int mx, int my, int r) {
        super();
        this.centerPoint = new Point(mx, my);
        this.radius = r;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double kreis = new Ellipse2D.Double(centerPoint.getX() - radius,
                centerPoint.getY() - radius, 2 * radius, 2 * radius);
        g2d.draw(kreis);
    }
}
