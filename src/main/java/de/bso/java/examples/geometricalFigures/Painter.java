package de.bso.java.examples.geometricalFigures;

public class Painter {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        Circle circle1 = new Circle();
        board.addGeometrical(circle1);
        Circle circle2 = new Circle(100, 100, 100);
        board.addGeometrical(circle2);
        Thread.sleep(2000);
        System.out.println("start zoom circle2");
        board.repaint();
    }
}
