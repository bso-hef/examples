package de.bso.java.examples.inputoutput;

//imports are required to use existing functionality
import java.util.*;

public class NumberInput {

	public static void main(String[] args) {

		//Class Scanner is used to read input from the console(System.in)
		//Use this whole line to create a Scanner.
		Scanner input = new Scanner(System.in);

		int number;

		//a request to enter a number is printed to the console
		System.out.println("Bitte eine Zahl eingeben:");

		//reads an int from the input
		number = input.nextInt();

		//the output is created by text concatenated with the number stored in the variable number
		System.out.println("Die Zahl ist:" + number );

	}

}