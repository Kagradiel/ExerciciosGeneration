package atividade05Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleArrayListNumberSearch {

	public static void handle(Scanner read) {

		ArrayList<Integer> numberList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numberList.add(i + 1);
		}

		System.out.print("\nDigite um número inteiro: ");
		int number = read.nextInt();

		if (!numberList.contains(number))
			System.out.println("\nO número " + number + " não foi encontrado!");
		else
			System.out.println("\nO número " + number + " está localizado na posição: " + numberList.indexOf(number));


	}

}
