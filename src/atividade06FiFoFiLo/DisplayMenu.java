package atividade06FiFoFiLo;

import java.util.Scanner;

public class DisplayMenu {

	public static byte display(Scanner read, String[] menuList) {

		System.out.println("\n----------------------------------------\n");
		
		for (int i = 0; i < menuList.length; i++)
			System.out.println(menuList[i]);
		
		System.out.println("\n----------------------------------------\n");

		System.out.print("O que você quer fazer: ");

		byte menu = read.nextByte();

		return menu;
	}

}
