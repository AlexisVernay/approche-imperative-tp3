package fr.approche.imperative;

import java.util.Scanner;

public class SuiteFibonacci {

	public static void main(String[] args) {
		
		int a, b, rang, result = 0;
		a = 0;
		b = 1;
		Scanner questionUser = new Scanner(System.in);
		System.out.println("\nEntrez le rang à laquel vous voulez calculer la suite de Fibonnaci");
		rang = questionUser.nextInt();
		if (rang == 0) {
			System.out.println("\nRésultat : " + a);
		} else if (rang == 1) {
			System.out.println("\nRésultat : " + b);
		} else {
			while (rang > 1) {
				result = a + b;
				a = b;
				b = result;
				rang--;
			}
			System.out.println("\nRésultat : " + result);
		}
		
		questionUser.close();

	}

}
