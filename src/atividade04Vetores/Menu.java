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
			
			int[] array1 = {5, 10, 50, 68, 680, 80, 60, 7, 3, 22};
			int number = 0;
			
			System.out.println("\nDigite o numero que deseja a posição: ");
			number = read.nextInt();
			
			IdentifyArray value = new IdentifyArray();
			value.arrayPosition(array1, number);
			
			break;

		case 2:
			
			ArraySeparator part = new ArraySeparator();
			
			int[] array2 = new int[10];
			
			System.out.println("\nCrie um vetor");
			
			for(int i = 0; i < array2.length; i++) {
				
				System.out.println("\nDigite o numero " + (i+1) + " do vetor: ");
				array2[i] = read.nextInt();
				
			}
			
			part.oddIndex(array2);
			part.pairElements(array2);
			System.out.println("Soma: " + part.arraySum(array2));
			System.out.println("\nMédia: " + String.format("%.2f",part.arrayAverage(array2)));
			
			break;

		case 3:
			
			MatrixSeparator matrices = new MatrixSeparator();
			
			int[][] matrix = {{1,2,3},
							  {4,5,6},
							  {7,8,9}};
			
			System.out.println("\n\nElementos da Diagonal Principal: ");
			matrices.mainDiagonal(matrix);
			
			System.out.println("\n\nElementos da Diagonal Secundária: ");
			matrices.secondaryDiagonal(matrix);
			
			System.out.println("\n\nSoma dos Elementos da Diagonal Principal: \n" + matrices.mainDiagonalSum(matrix));
			
			System.out.println("\nSoma dos Elementos da Diagonal Secundária: \n" + matrices.secondaryDiagonalSum(matrix));
			
			
			break;

		case 4:
			
			AverageByMatrix matrixGrids = new AverageByMatrix();
			
			float[][] grades = {
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
			
			float[] averages = matrixGrids.averageToArray(grades);
			
			System.out.println(Arrays.toString(averages));
			
			break;
		
		default:
			System.out.println("Valor invalido");
			break;
		}

		read.close();

	}

}
