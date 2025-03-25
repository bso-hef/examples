package de.bso.java.examples.designpattern.observer.mvc3;

import java.util.Observable;

public class CommandlineView extends KompassView {

    public CommandlineView(KompassModel kompassModel, KompassControllerInterface controller) {
        super(kompassModel, controller);
    }

    public void zeigeKurskorrektur(int kurskorrektur) {
        System.out.println("Steuerkurs-Korrekturanfrage: " + kurskorrektur + " Grad");
    }

    public void update(Observable obs, Object obj) {
        System.out.println("---------------------------------");
        System.out.println("Steuerkurs: " + getKompassModel().getSteuerkurs());
        System.out.println("Aktueller Kurs: " + getKompassModel().getKompasskurs());
        System.out.println("---------------------------------");
    }
}