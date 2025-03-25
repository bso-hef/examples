package de.bso.java.examples.designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().getValue());
    }
}
