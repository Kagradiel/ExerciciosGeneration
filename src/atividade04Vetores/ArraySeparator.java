package atividade04Vetores;

public class ArraySeparator {

	public void oddIndex(int[] array1) {

		System.out.println("\nElementos nos índices ímpares: ");

		for (int i = 0; i < array1.length; i++) {
			if (i % 2 != 0) {
				System.out.print(array1[i] + " ");
			}
		}

		System.out.println("\n");

	}

	public void pairElements(int[] array1) {

		System.out.println("\nElementos pares: ");

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > 0 && array1[i] % 2 == 0) {
				System.out.print(array1[i] + " ");
			}
		}

		System.out.println("\n");

	}

	public int arraySum(int[] array1) {

		int result = 0;
		
		
		for (int i = 0; i < array1.length; i++) {
			result += array1[i];
		}

		return result;

	}
	
	public float arrayAverage(int[] array1) {

		float result = 0;
		
		result = (float)arraySum(array1)/array1.length;
		
		return result;

	}
	
	
	
	

}
