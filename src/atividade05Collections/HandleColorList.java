package atividade05Collections;

import java.util.ArrayList;
import java.util.Scanner;

import atividade05Collections.Services.CollectionsManipulator;

public class HandleColorList {

	private static CollectionsManipulator listManipulator = new CollectionsManipulator();

	public static void handle(Scanner read) {

		ArrayList<String> colors = new ArrayList<>();

		listManipulator.getArrayList(colors, 5, "Digite a cor", read);

		System.out.println("\nListar todas as cores:\n");
		listManipulator.stackedListSysout(colors);

		System.out.println("\nOrdenar as cores:\n");
		colors.sort(null);
		listManipulator.stackedListSysout(colors);

	}

}
