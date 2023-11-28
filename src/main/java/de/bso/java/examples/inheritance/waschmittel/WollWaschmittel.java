package de.bso.java.examples.inheritance.waschmittel;

public class WollWaschmittel extends Waschmittel{

    @Override
    public void reinigen() {
        System.out.println("Reinige Wolle");
    }

    public void wollePflegen() {
        this.reinigen();
    }
}
