package atividade02;

import java.util.Scanner;

public class Tabuada {
	
	public void calculadoraSwitch() {
		
		Scanner read = new Scanner(System.in);

		byte menu = 0;
		float num1, num2;
		
		System.out.println("Voce deseja realizar qual operação: \n" 
							+ "1 - Soma\n"
							+ "2 - Subtração\n" 
							+ "3 - Multiplicação \n" 
							+ "4 - Divisão\n" );
		
		menu = read.nextByte();
		
		System.out.println("Digite o primeiro numero: ");
		num1 = read.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		num2 = read.nextFloat();
		
		switch (menu) {
		
		case 1: 
			System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
			break;
			
		case 2: 
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
			
		case 3: 
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		
		case 4: 
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		
		default:
			System.out.println("Operação Inválida!");
		
		}
		
		read.close();
	}
	
}
