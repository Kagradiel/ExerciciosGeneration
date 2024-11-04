package atividade05Collections;

import java.util.ArrayList;
import java.util.Scanner;

import atividade05Collections.Services.CollectionsManipulator;

public class HandleColorList {

	public static void handle(Scanner read) {

		ArrayList<String> colors = new ArrayList<>();

		CollectionsManipulator.getArrayList(colors, 5, "Digite a cor", read);

		System.out.println("\nListar todas as cores:\n");
		CollectionsManipulator.stackedListSysout(colors);

		System.out.println("\nOrdenar as cores:\n");
		colors.sort(null);
		CollectionsManipulator.stackedListSysout(colors);

	}

}
