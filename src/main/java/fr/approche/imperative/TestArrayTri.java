package fr.approche.imperative;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		System.out.println("Tri du tableau dans l'ordre ascendant");
		int[] tableauTri = array;
		int echange;
	
		for (int i = 0; i < tableauTri.length; i++){
			for (int l = i+1; l < tableauTri.length; l++) {
				if (tableauTri[i] > tableauTri[l]) {
					echange = tableauTri[i];
					tableauTri[i] = tableauTri[l];
					tableauTri[l] = echange;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(tableauTri[i]);
		}
		
		System.out.println("Tri du tableau dans l'ordre ascendant en utilisant la classe Arrays");
		Arrays.sort(array);
		for (int i = 0; i < array.length ; i++){
			System.out.println(array[i]);
		}
	}

}
