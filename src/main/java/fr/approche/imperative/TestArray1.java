package fr.approche.imperative;

public abstract class TestArray1 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		System.out.println("\n Contenu du tableau dans l'ordre");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		System.out.println("\n Contenu du tableau dans l'ordre inverse");
		for(int i = array.length-1; i >= 0; i--){
			System.out.println(array[i]);
		}
		
		System.out.println("\n Afficher que les entiers supérieurs à 3");
		for(int i = 0; i < array.length; i++){
			if(array[i] > 3) {
				System.out.println(array[i]);
			}	
		}
		
		System.out.println("\n Afficher que les entiers pairs");
		for(int i = 0; i < array.length; i++){
			if((array[i] % 2) == 0) {
				System.out.println(array[i]);
			}	
		}
		
		System.out.println("\n Afficher le plus grand élément");
		int valMax = 0;
		for(int i = 0; i < array.length; i++){
			if(i== 0) {
				continue;
			}
			if(array[i] < array[i-1]) {
				continue;
			}
			if(array[i] > valMax){
				valMax = array[i];
			}			
		}
		System.out.println(valMax);
		
		System.out.println("\n Afficher le plus grand élément");
		int valMin = 0;
		for(int i = 0; i < array.length; i++){
			if(i== 0) {
				continue;
			}
			if(array[i] > array[i-1]) {
				continue;
			}
			if(array[i] < valMin){
				valMin = array[i];
			}			
		}
		System.out.println(valMin);
	}
}
