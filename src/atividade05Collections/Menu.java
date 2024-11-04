package atividade05Collections;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);
		
		byte menu = -1;

		do {
			
			menu = DisplayMenu.display(read);
			
			switch (menu) {

			case 1:
				HandleColorList.handle(read);
				break;

			case 2:
				HandleArrayListNumberSearch.handle(read);
				break;

			case 3:
				HandleHashSetIteration.handle(read);
				break;

			case 4:
				HandleNumberInSet.handle(read);
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Valor invalido");
				break;
			}

		} while (menu != 0);
		
		read.close();
	}

}
