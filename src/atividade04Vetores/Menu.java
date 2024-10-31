package atividade04Vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner read = new Scanner(System.in);
		
		byte menu = 0;
		
		System.out.println("\nVoce deseja acessar qual atividade: \n" 
							+ "1 - Encontrar posição no vetor\n"
							+ "2 - Separador de vetor\n" 
							+ "3 - Separar matriz \n" 
							+ "4 - Media de notas\n");

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

		case 3:
			
			SeparadorMatriz matrizes = new SeparadorMatriz();
			
			int[][] matriz = {{1,2,3},
							  {4,5,6},
							  {7,8,9}};
			
			System.out.println("\n\nElementos da Diagonal Principal: ");
			matrizes.diagonalPrincipal(matriz);
			
			System.out.println("\n\nElementos da Diagonal Secundária: ");
			matrizes.diagonalSecundaria(matriz);
			
			System.out.println("\n\nSoma dos Elementos da Diagonal Principal: \n" + matrizes.somaDiagonalPrincipal(matriz));
			
			System.out.println("\nSoma dos Elementos da Diagonal Secundária: \n" + matrizes.somaDiagonalSecundaria(matriz));
			
			
			break;

		case 4:
			
			MediaPorMatriz notasEmMatriz = new MediaPorMatriz();
			
			float[][] notas = {
		            {4.0f, 5.0f, 7.0f, 3.0f},
		            {2.5f, 6.5f, 4.7f, 8.0f},
		            {10.0f, 8.5f, 9.5f, 8.0f},
		            {9.0f, 6.5f, 7.6f, 8.2f},
		            {5.0f, 5.0f, 5.0f, 6.3f},
		            {7.0f, 8.0f, 9.0f, 8.5f},
		            {5.5f, 3.5f, 2.5f, 1.0f},
		            {8.0f, 9.0f, 10.0f, 9.5f},
		            {5.6f, 5.8f, 6.5f, 7.0f},
		            {7.5f, 8.5f, 9.5f, 10.0f}
		        };
			
			float[] medias = notasEmMatriz.notasParaVetor(notas);
			
			System.out.println(Arrays.toString(medias));
			
			break;
		
		default:
			System.out.println("Valor invalido");
			break;
		}

		read.close();

	}

}
