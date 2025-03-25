package de.bso.java.examples.polymorphism;

public class Ueberladen {

    public static void main(String[] args) {
        Ueberladen u = new Ueberladen();
        u.print("Hallo");
        u.print("Hallo", "Welt");
    }

    /**
     * Prints the variable txt to the console.
     * @param txt
     */
    public void print(String txt) {
        System.out.println(txt);
    }

    /**
     * Prints the variable txt prefixed by "name: ".
     * @param txt
     * @param name
     */
    public void print(String txt, String name) {
        System.out.println(name + ": "  + txt);
    }
} 