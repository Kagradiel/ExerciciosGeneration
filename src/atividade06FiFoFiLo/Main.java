package atividade06FiFoFiLo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		byte menu = 3;

		String[] menuList = { "1 - Gerenciador de clientes", "2 - Exercicio Pilha", "0 - Sair" };

		do{

			menu = DisplayMenu.display(read, menuList);

			switch (menu) {

			case 1:
				Manager.clientManager(read);
				break;

			case 2:
				Manager.libraryManager(read);
				break;

			case 0:
				System.out.println("Saindo....");
				break;

			default:
				System.out.println("Operação Inválida");
				break;
			}

		}while (menu != 0);

		read.close();

	}

}
