package atividade04Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner read = new Scanner(System.in);
		
		byte menu = 0;
		
		System.out.println("\nVoce deseja acessar qual atividade: \n" 
							+ "1 - Encontrar posição no vetor\n"
							+ "2 - Separador de vetor\n");

		System.out.println("\n\nQual atividade você quer realizar: ");
		menu = read.nextByte();

		switch (menu) {

		case 1:
			
			int[] vetor = {5, 10, 50, 68, 680, 80, 60, 7, 3, 22};
			int numero = 0;
			
			System.out.println("\nDigite o numero que deseja a posição: ");
			numero = read.nextInt();
			
			Identificar valor = new Identificar();
			valor.PosicaoVetor(vetor, numero);
			
			break;

		case 2:
			
			SeparadorVetorial separar = new SeparadorVetorial();
			
			int[] vetor2 = new int[10];
			
			System.out.println("\nCrie um vetor");
			
			for(int i = 0; i < vetor2.length; i++) {
				
				System.out.println("\nDigite o numero " + (i+1) + " do vetor: ");
				vetor2[i] = read.nextInt();
				
			}
			
			separar.indicesImpares(vetor2);
			separar.elementosPares(vetor2);
			System.out.println("Soma: " + separar.somaVetor(vetor2));
			System.out.println("\nMédia: " + String.format("%.2f",separar.mediaDeVetor(vetor2)));
			
			break;

		
		default:
			System.out.println("Valor invalido");
			break;
		}

		read.close();

	}

}
