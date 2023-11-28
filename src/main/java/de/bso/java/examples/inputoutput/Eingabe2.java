package de.bso.java.examples.inputoutput;

import java.util.Scanner;

class Eingabe2{
  public static void main (String[] args)  {
    String vorname;
    String nachname;
    
    Scanner eingabe = new Scanner( System.in );

    System.out.println("Geben Sie Ihren Vornamen ein:");
    vorname = eingabe.nextLine();
    
    System.out.println("Geben Sie Ihren Nachnamen ein:");
    nachname = eingabe.nextLine();

    System.out.println("Hallo! Sie heißen: " + vorname +" "+nachname);
  }
}
