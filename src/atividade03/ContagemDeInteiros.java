package atividade03;

import java.util.Scanner;

public class ContagemDeInteiros {

	public void contarPositivos() {
		
		Scanner read = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		do {
			
			System.out.println("Digite um numero inteiro ou zero para sair: ");
			numero = read.nextInt();
			
			if(numero > 0)
				soma += numero;
			
		}while(numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		read.close();
		
	}
	
	public void mediaMultiplosDe3() {
		
		Scanner read = new Scanner(System.in);
		
		int numero = 0, contador = 0;
		float media = 0;
		
		do {
			
			System.out.println("Digite um numero inteiro ou zero para sair: ");
			numero = read.nextInt();
			
			if(numero%3 == 0 && numero != 0) {
				contador++;
				media += (float) numero;
			}
				
				
			
		}while(numero != 0);
		
		System.out.println("A media dos multiplos de 3 é: " + (media/contador));
		
		read.close();
	}
	
}
