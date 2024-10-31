package atividade04Vetores;

public class IdentifyArray {
	
	public void arrayPosition(int[] array1, int number) {
		
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == number) {
				System.out.println("\nO número " + number +" está localizado na posição: " + i);
				return;
			}
		}
		
		System.out.println("O número " + number + " não foi encontrado!");
		
		
	}

}
