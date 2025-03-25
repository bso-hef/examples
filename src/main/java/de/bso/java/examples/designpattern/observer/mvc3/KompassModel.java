package de.bso.java.examples.designpattern.observer.mvc3;

import java.util.Observable;

public class KompassModel extends Observable {

    private int steuerkurs;
    private int kompasskurs;

    public KompassModel () {
        //Optional: Initialisierung hier
        setzeSteuerkurs(0);
        setzeKompasskurs(120);
    }

    public int getSteuerkurs () {
        return steuerkurs;
    }

    public void setzeSteuerkurs ( int steuerkurs) {
        if (steuerkurs >= 0 && steuerkurs <= 360 ) {
            this.steuerkurs = steuerkurs;
        }
        setChanged (); //ohne Angabe des Kurses, Observer müss en daher die get-Methoden bemühen
        notifyObservers ();
    }

    public int getKompasskurs () {
        return kompasskurs;
    }

    public void setzeKompasskurs ( int kompasskurs) {
        if (kompasskurs >= 0 && kompasskurs <= 360 ) {
            this.kompasskurs = kompasskurs;
            setChanged ();
            notifyObservers ();
        }
    }
}