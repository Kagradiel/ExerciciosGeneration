package atividade05Collections.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class CollectionsManipulator {

	public static void getArrayList(ArrayList<String> text, int size, String title, Scanner read) {

		for (int i = 0; i < size; i++) {
			System.out.println("\n" + title + " " + (i + 1) + ": ");
			text.add(read.nextLine());
		}

	}

	public static void stackedListSysout(Collection<String> texts) {

		for (String text : texts) {
			System.out.println(text);
		}

	}

	public static void getSet(Set<Integer> list, int size, String title, Scanner read) {

		for (int i = 0; i < size; i++) {
			System.out.println("\n" + title + " " + (i + 1) + ": ");
			list.add(read.nextInt());
		}

	}

}
