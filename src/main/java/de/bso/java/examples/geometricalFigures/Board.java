package de.bso.java.examples.geometricalFigures;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Zeichnet einen Kreis mit dem Mittelpunkt mx/my und dem Radius r
 * 
 */
public class Board extends JFrame {

    static final int WIDTH = 600;
    static final int HEIGHT = 600;

    private final BoardPanel panel;

    public Board(int width, int height){
        panel = new BoardPanel();
        this.add(panel);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Board(){
        this(WIDTH, HEIGHT);
    }


    public void addGeometrical(GeometricalFigure figure) {
        this.panel.addFigure(figure);
    }

    public static class BoardPanel extends JPanel {

        ArrayList<GeometricalFigure> figures = new ArrayList<>();

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
            g2d.setColor(Color.BLACK);

            for (GeometricalFigure figure: this.figures) {
                figure.draw(g2d);
            }
        }

        public void addFigure(GeometricalFigure figure) {
            this.figures.add(figure);
            this.repaint();
        }
    }
}

