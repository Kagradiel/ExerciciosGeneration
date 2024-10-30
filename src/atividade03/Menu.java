package atividade03;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
	
		ContagemDeInteiros contador = new ContagemDeInteiros();	
		byte menu = 0;
		
		System.out.println("\nVoce deseja acessar qual atividade: \n" 
							+ "1 - Multiplos de 3 e 5\n"
							+ "2 - Contagem de par ou impar\n" 
							+ "3 - Separar por idade \n" 
							+ "4 - Pesquisa de Colaboradores\n"
							+ "5 - Contagem de numeros digitados\n"
							+ "6 - Media de multiplos de 3\n");

		System.out.println("\n\nQual atividade você quer realizar: ");
		menu = read.nextByte();

		switch (menu) {

		case 1:
			Multiplos checarIntevalo = new Multiplos();
			checarIntevalo.tresECinco();
			break;

		case 2:
			Contagem multiplos = new Contagem();
			multiplos.parOuImpar();
			break;

		case 3:
			Separador separar = new Separador();
			separar.porIdade();
			break;

		case 4:
			Pesquisas colaboradores = new Pesquisas();
			colaboradores.generoEStack();
			break;

		case 5:	
			contador.contarPositivos();
			break;
			
		case 6:
			contador.mediaMultiplosDe3();
			break;
		
		default:
			System.out.println("Valor invalido");
			break;
		}

		read.close();
	}

}
