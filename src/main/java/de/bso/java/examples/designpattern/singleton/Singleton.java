package de.bso.java.examples.designpattern.singleton;

/**
 * Einfache Implementierung des Design Pattern Singleton.
 *
 * - Nicht Thread save
 * - Nicht für verteilte Anwendungen geeignet
 * - Nur in einer VM einsetzbar
 */
public class Singleton {
	/**
	 * vor Zugriff von außen geschützt und statisch
	 */
	private static Singleton instance; //

	private int value = 10;

	/**
	 * privater Konstruktor nicht erreichbar von außen
	 */
	private Singleton() {}

	/**
	 * Statische Methode für Clients um eine Instance abzurufen.
	 *
	 * @return
	 */
	public static Singleton getInstance() { // öffentliche Methode, Aufruf durch Code
		if (instance == null) { // nur wenn keine Instanz besteht, dann erstelle eine neue
			instance = new Singleton();
		}
		return instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}