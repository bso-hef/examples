package de.bso.java.examples.geometricalFigures;

import java.awt.*;
import java.awt.geom.Ellipse2D;

class Circle extends GeometricalFigure {

    private  int mx = 200;
    private  int my = 200;
    private  int r = 200;


    public Circle() {
        super();
    }

    public Circle(int mx, int my, int r) {
        super();
        this.mx = mx;
        this.my = my;
        this.r = r;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double kreis = new Ellipse2D.Double(mx - r , my - r , 2 * r , 2 * r);
        g2d.draw(kreis);
    }
}
