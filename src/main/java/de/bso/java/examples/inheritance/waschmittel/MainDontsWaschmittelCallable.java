package de.bso.java.examples.inheritance.waschmittel;

import java.util.ArrayList;

public class MainDontsWaschmittelCallable {

    public static void main(String[] args) {
        ArrayList<WollWaschmittel> waschmittelsamlung = new ArrayList<>(10);
        waschmittelsamlung.add(new WollWaschmittel());

        System.out.println("Waschen:");
        for (WollWaschmittel waschmittel: waschmittelsamlung) {
            waschmittel.reinigen();
            waschmittel.wollePflegen();
        }
    }
}
