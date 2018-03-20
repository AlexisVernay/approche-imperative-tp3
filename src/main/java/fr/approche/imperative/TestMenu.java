package fr.approche.imperative;

import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) {
		
		int a;
		int index = 0;
		int[] array = new int[5];
		
		Scanner questionUser = new Scanner(System.in);
		System.out.println("\nEntrez votre option (1 pour ajouter nombre, 2 pour voir tableau, 3 pour quitter) : ");
		a = questionUser.nextInt();
		
		while (a != 3) {
			switch (a) {
			case 1:
				System.out.println("\nEntrez votre nombre");
				array[index] = questionUser.nextInt();
				index++;
				if (index >= array.length){
					System.out.println("\nAgrandissement tableau");
					int[] newtab = new int[array.length+5];
					for (int i = 0; i < index; i++) {
						newtab[i] = array[i];
					}
					array = newtab;
				}
				break;

			case 2:
				for (int i = 0; i < index; i++) {
					System.out.println(array[i]);
				}
				break;

			}
			System.out.println("\nEntrez votre option (1,2 ou 3) : ");
			a = questionUser.nextInt();
		}
		questionUser.close();
	}

}
