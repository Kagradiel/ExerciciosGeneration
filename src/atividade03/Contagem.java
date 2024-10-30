package atividade03;

import java.util.Scanner;

public class Contagem {

	public void parOuImpar() {

		try (Scanner read = new Scanner(System.in)) {

			int i = 0, numero = 0, zeros = 0, pares = 0, impares = 0;

			System.out.println("Contagem de pares e impares");

			for (i = 0; i < 10; i++) {
				
				System.out.println("Digite o " + (i + 1) + "\u00BA numero: ");
				numero = read.nextInt();
				
				if (numero % 2 == 0 && numero != 0) {
					pares++;
				} else if (numero == 0) {
					zeros++;
				} else {
					impares++;
				}
			}

			System.out.println("\nTotal de números pares: " + pares 
							 + "\nTotal de números ímpares: " + impares
							 + "\nTotal de Zeros: " + zeros);

		}

	}

}
