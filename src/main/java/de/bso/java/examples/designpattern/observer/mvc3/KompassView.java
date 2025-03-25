package de.bso.java.examples.designpattern.observer.mvc3;

import java.util.Observer;

public abstract class KompassView implements Observer {

    private KompassModel kompassModel;
    private KompassControllerInterface controller;

    protected KompassModel getKompassModel() {
        return kompassModel;
    }

    protected KompassControllerInterface getController() {
        return controller;
    }

    public abstract void zeigeKurskorrektur(int kurskorrektur);

    public KompassView(KompassModel kompassModel, KompassControllerInterface controller) {
        this.kompassModel = kompassModel;
        this.controller = controller;
        kompassModel.addObserver(this);
        controller.addView(this);
    }
}