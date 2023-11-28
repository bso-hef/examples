package de.bso.java.examples.inheritance.waschmittel;

import java.util.ArrayList;

public class Waschmittel {

    public String farbe;
    protected int pulvergroese;
    ArrayList<String> bestandteil;

    public void reinigen() {
        System.out.println("Reinige");
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPulvergroese() {
        return pulvergroese;
    }

    public void setPulvergroese(int pulvergroese) {
        this.pulvergroese = pulvergroese;
    }

    public ArrayList<String> getBestandteil() {
        return bestandteil;
    }

    public void setBestandteil(ArrayList<String> bestandteil) {
        this.bestandteil = bestandteil;
    }
}
