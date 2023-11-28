package de.bso.java.examples.pruefungen.advanturegame;

public class Held {

    private String name;

    private int kraft;

    private int angriffswert;

    private int verteidigungswert;

    private Inventar rucksack;

    private Gegenstand handLinks;

    private Gegenstand handRechts;

    public Held(String name) {
        this.name = name;
    }

    public int getKraft() {
        return kraft;
    }

    public void setKraft(int kraft) {
        this.kraft = kraft;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

    public int getVerteidigungswert() {
        return verteidigungswert;
    }

    public void setVerteidigungswert(int verteidigungswert) {
        this.verteidigungswert = verteidigungswert;
    }

    public void anlegen(Gegenstand gegenstand) {
        if(handLinks == null) {
            this.handLinks = gegenstand;
        } else if(handRechts == null) {
            this.handRechts = gegenstand;
        }
    }

    public void ablegen(Gegenstand gegenstand){
        if(handLinks.getName() == gegenstand.getName()) {
            this.handLinks = gegenstand;
        } else if(handRechts.getName() == gegenstand.getName()) {
            this.handRechts = gegenstand;
        }
    }

    public void ausDemRucksackEntfernen(Gegenstand gegenstand) {
        this.rucksack.auspacken(gegenstand);
    }
}
