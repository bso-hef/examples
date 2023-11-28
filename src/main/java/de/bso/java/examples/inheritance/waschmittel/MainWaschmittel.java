package de.bso.java.examples.inheritance.waschmittel;

import java.util.ArrayList;

public class MainWaschmittel {

    public static void main(String[] args) {
        ArrayList<Waschmittel> waschmittelsamlung = new ArrayList<>();
        waschmittelsamlung.add(new Waschmittel());
        waschmittelsamlung.add(new WollWaschmittel());
        waschmittelsamlung.add(new ColorWaschmittel());

        System.out.println("Waschen:");
        for (Waschmittel waschmittel: waschmittelsamlung) {
            waschmittel.reinigen();
        }

    }
}
