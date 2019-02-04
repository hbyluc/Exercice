package Exercice;

import java.util.Scanner;

public class Calculette {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		int value;
		value = scanner.nextInt();
		System.out.println(value);
		//Q1
		
		Scanner scanner1;
		scanner1 = new Scanner(System.in);
		int value1;
		value1 = scanner1.nextInt();
		System.out.println(value1);
		
		Scanner scanner2;
		scanner2 = new Scanner(System.in);
		int value2;
		value2 = scanner2.nextInt();
		System.out.println(value2);
		
		int somme = value1 + value2;
		System.out.println(somme);
		int difference = value1 - value2;
		System.out.println(difference);
		int produit = value1 * value2;
		System.out.println(produit);
		int quotient = value1 / value2;
		System.out.println(quotient);
		int reste = value1 % value2;
		System.out.println(reste);
	}

}
