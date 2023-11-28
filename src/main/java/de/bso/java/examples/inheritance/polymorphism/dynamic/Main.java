package de.bso.java.examples.inheritance.polymorphism.dynamic;

public class Main {
    public static void main(String[] args) {
        Yes y = new Yes();
        Yes n = new No();
        y.sayYes();
        n.sayYes();
    }
}