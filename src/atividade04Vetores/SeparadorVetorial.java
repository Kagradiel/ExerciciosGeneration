package atividade04Vetores;

public class SeparadorVetorial {

	public void indicesImpares(int[] vetor) {

		System.out.println("\nElementos nos índices ímpares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.println("\n");

	}

	public void elementosPares(int[] vetor) {

		System.out.println("\nElementos pares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0 && vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.println("\n");

	}

	public int somaVetor(int[] vetor) {

		int resultado = 0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			resultado += vetor[i];
		}

		return resultado;

	}
	
	public float mediaDeVetor(int[] vetor) {

		float resultado = 0;
		
		resultado = (float)somaVetor(vetor)/vetor.length;
		
		return resultado;

	}
	
	
	
	

}
