package de.bso.java.examples.calculation;

public class Addition {

	public static void main(String[] args) {
		
		// eine Variable vom Typ int (Ganzzahl) erzeugen
		int number1;
		
		// einen Wert in die Variable speichern
		number1 =  40;
		
		// eine weitere Variable erzeugen und direkt einen Wert zuweisen
		int number2 = 42;
		
		// eine Variable fuer das Ergebnis erzeugen und mit dem Wert Null initialisieren
		int result = 0;
		
		// Die Werte der beiden Variablen number1 und number2 addieren und das Ergebnis
		// in der Variablen Zahl ausgeben
		result = number1 + number2;
		
		// Das Ergebnis auf dem Bildschirm ausgeben
		System.out.println("Das Ergebnis ist: " + result);
	}
	
	
	
}