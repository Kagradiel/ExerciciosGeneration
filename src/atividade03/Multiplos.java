package atividade03;

import java.util.Scanner;

public class Multiplos {
	public void tresECinco() {
		
		Scanner read = new Scanner(System.in);
		
		int maior, menor, i;
		
		System.out.println("Checagem de numeros multiplos de 3 e 5");
		
		System.out.println("Digite o menor numero: ");
		menor = read.nextInt();
		
		System.out.println("\nDigite o maior numero: ");
		maior = read.nextInt();
		
		read.close();	
		
		System.out.println("\n");
		
		if(maior <= menor) {
			System.out.println("Intervalo inválido!");
		}else {
			
			for(i=menor;i <= maior; i++) {
				if(i%3 == 0 && i%5 == 0 && i != 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
			
			
		}
		
		
		
	}
}
