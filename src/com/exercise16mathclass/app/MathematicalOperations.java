package com.exercise16mathclass.app;

import java.lang.Math;
import java.util.Scanner;
public class MathematicalOperations {

	public static void main(String[] args) {
		// Variables declaration
		double number1 = 3.76;
		double number2 = 5.5;
		// Object construction
		Scanner scan = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.print( "e value: "+ Math.E);
		System.out.print( "pi value: "+ Math.PI);
		
		// Absolute
		System.out.println("Absolute value of -2.15 is" + Math.abs(-2.15));
		// Cube root
		System.out.println("The cube root of 27 is" + Math.cbrt(27));
		// Round numbers
		System.out.println("The round of 3.76 is " + Math.round(number1));
		System.out.println("The round ceil of 3.76 is " + Math.ceil(number1));
		System.out.println("The round floor of 3.76 is " + Math.floor(number1));
		// Increment and decrement
		System.out.println("Increment of 5 is" + Math.incrementExact(5));
		System.out.println("Decrement of 5 is" + Math.decrementExact(5));
		System.out.println("Power value of 3 Euler is "+ Math.exp(3));
		// Max and min
		System.out.println(String.format("Wich is biger? %.2f or %.2f: %.2f", number1,number2,Math.max(number1, number2)));
		System.out.println(String.format("Wich is smaller? %.2f or %.2f: %.2f", number1,number2,Math.min(number1, number2)));
		// Sin and Cos
		System.out.println("Sin of 90 degres is "+ Math.sin(0));
		System.out.println("Sin of PI/2 degres is "+ Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degres is "+ Math.cos(0));
		System.out.println("Cos of PI/2 degres is "+ Math.cos(Math.PI/2));
		for(int i = 0; i < 5; i++) {
			System.out.println("Input a number");
			number1 = scan.nextDouble();
			System.out.println("The square of "+number1+" is "+ Math.pow(number1, 2));
		}
	}

}
