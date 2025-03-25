package de.bso.java.examples.designpattern.observer.mvc3;

public class Main {

    public static void main(String[] args) {
        KompassModel model = new KompassModel();
        KompassController controller = new KompassController(model);
        controller.addView(new CommandlineView(model, controller));
        controller.addView(new SteuerkursWindowView(model, controller));
        controller.addView(new SteuerkursWindowView(model, controller));
    }
}
