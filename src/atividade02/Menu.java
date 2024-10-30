package atividade02;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		short menu = 0;
		
		System.out.println("Voce deseja acessar qual atividade: \n" 
							+ "1 - Comparação de numeros\n"
							+ "2 - Checar positivo ou negativo\n" 
							+ "3 - Apto a doar sangue? \n" 
							+ "4 - Classificação animal\n"
							+ "5 - Menu da lanchonete");

		System.out.println("\n\nQual atividade você quer realizar: ");
		menu = read.nextShort();

		switch (menu) {

		case 1:
			MaiorOuMenor comparativo = new MaiorOuMenor();
			comparativo.maiorOuMenor();
			break;

		case 2:
			int numero = 0;
			
			System.out.println("Digite um numero: ");
			numero = read.nextInt();
			
			PositivoOuNegativo positivoOuNao = new PositivoOuNegativo();
			positivoOuNao.positivoOuNegativo(numero);
			break;

		case 3:
			
			DoarSangue doar = new DoarSangue();
			doar.aptoOuNao();
			
			break;

		case 4:
			ComparadorDeStrings classeAnimal = new ComparadorDeStrings();
			classeAnimal.comparadorDeStrings();
			break;

		case 5:
			Lanchonete comprarLanche = new Lanchonete();
			comprarLanche.cardapio();
			break;
			
		default:
			System.out.println("Valor invalido");
			break;
		}

		read.close();

	}

}