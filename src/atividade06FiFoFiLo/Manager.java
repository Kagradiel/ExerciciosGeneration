package atividade06FiFoFiLo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import atividade05Collections.Services.CollectionsManipulator;

public class Manager {

	public static void clientManager(Scanner read) {

		Queue<String> clientes = new LinkedList<String>();

		String[] menuList = { "1 - Adicionar Cliente na Fila", "2 - Listar Todos os Clientes",
							  "3 - Retirar Cliente da Fila", "0 - Sair" };
		byte menu = 50;

		do {

			menu = DisplayMenu.display(read, menuList);

			switch (menu) {

			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				read.nextLine();
				clientes.add(read.nextLine());

				System.out.println("\nFila: ");
				CollectionsManipulator.stackedListSysout(clientes);

				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				if (clientes.isEmpty()) {
					System.out.println("\nA Fila está vazia!\n");

				} else {
					System.out.println("\nLista de Clientes na Fila: \n");
					CollectionsManipulator.stackedListSysout(clientes);

				}
				break;

			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nA Fila está vazia!\n");

				} else {
					clientes.poll();

					System.out.println("\nFila: \n");
					CollectionsManipulator.stackedListSysout(clientes);

					System.out.println("\nO Cliente foi Chamado!");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Operação Inválida");
				break;

			}

		} while (menu != 0);

	}

	public static void libraryManager(Scanner read) {

		Stack<String> books = new Stack<String>();

		String[] menuList = { "1 - Adicionar Livro na Pilha", "2 - Listar Todos os Livros",
							  "3 - Retirar Livro da Pilha", "0 - Sair" };
		byte menu = 0;

		do {

			menu = DisplayMenu.display(read, menuList);

			switch (menu) {

			case 1:
				System.out.println("\nDigite o nome do Livro: ");
				read.nextLine();
				books.push(read.nextLine());

				System.out.println("\nPilha: \n");
				CollectionsManipulator.stackedListSysout(books);
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				if (books.isEmpty()) {
					System.out.println("\nA Pilha está vazia!!\n");

				} else {
					System.out.println("\nLista de Livros na Pilha: \n");

				}
				break;

			case 3:
				if (books.isEmpty()) {
					System.out.println("\nA Pilha está vazia!!\n");

				} else {
					books.pop();

					System.out.println("\nFila: \n");
					CollectionsManipulator.stackedListSysout(books);
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Operação Inválida");
				break;

			}

		} while (menu != 0);
	}

}
