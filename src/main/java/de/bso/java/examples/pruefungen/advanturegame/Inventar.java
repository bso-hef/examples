package de.bso.java.examples.pruefungen.advanturegame;

import java.util.ArrayList;

public class Inventar {

    private ArrayList<Gegenstand> gegenstaende;

    private int maxAnzahl;

    public Inventar() {
        this.gegenstaende = new ArrayList<>();
        this.maxAnzahl = -1;
    }

    public Gegenstand auspacken(Gegenstand gesuchterGegenstand) {
        for(int i = 0; i < this.gegenstaende.size(); i++) {
            if (gesuchterGegenstand.getName().equals(this.gegenstaende.get(i).getName())){
                Gegenstand gegenstand = this.gegenstaende.remove(i);
                return gegenstand;
            }
        }
        return null;
    }

}
