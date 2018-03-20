package fr.approche.imperative;

public class TestArray2 {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		System.out.println("\n La moyenne de éléments du tableau");
		int somme = 0;
		for(int i = 0; i < array.length; i++){
			somme += array[i];
		}
		int moy = somme / array.length;
		System.out.println(moy);
		
		
		System.out.println("\n L'index de l'entier 15");
		int index = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == 15) {
				index = i;
			}
		}
		System.out.println(index);
		
		
		System.out.println("\n Nombre d'entier en doublon");
		int doublon = 0;
		for(int i = 0; i < array.length; i++){
			for(int l = i + 1; l < array.length; l++){
				if(array[l] == array[i]) {
					doublon ++;
				}
			}		
		}
		System.out.println(doublon);
	}
}
