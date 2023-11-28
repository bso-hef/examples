package de.bso.java.examples.inheritance.waschmittel;

public class ColorWaschmittel extends Waschmittel{

    protected String colorpflege;

    @Override
    public void reinigen() {
        System.out.println("Reinige Farbwäsche");
    }

    public void reinigeFarbwäsche() {
        this.reinigen();
    }

    public String getColorpflege() {
        return colorpflege;
    }

    public void setColorpflege(String colorpflege) {
        this.colorpflege = colorpflege;
    }
}
