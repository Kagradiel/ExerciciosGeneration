package atividade04Vetores;

public class Identificar {
	
	public void PosicaoVetor(int[] vetor, int numero) {
		
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				System.out.println("\nO número " + numero +" está localizado na posição: " + i);
				return;
			}
		}
		System.out.println("O número " + numero + " não foi encontrado!");
		
		
	}

}
