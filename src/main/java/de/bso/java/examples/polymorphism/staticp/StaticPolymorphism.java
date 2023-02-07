package de.bso.java.examples.polymorphism.staticp;

/**
 * Example for static polymorphism.
 * Beispiel für statisches überladen.
 */
public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticPolymorphism u = new StaticPolymorphism();
        //Zur Kompilierzeit ist klar welche Methode aufgerufen wird.
        u.print("Hallo");
        u.print("Hallo", "Welt");
    }

    public void print(String txt) {
        System.out.println(txt);
    }

    public void print(String txt, String name) {
        System.out.println(txt + " " + name);
    }
} 