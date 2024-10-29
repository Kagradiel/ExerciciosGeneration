package atividade02.services;

import java.util.Scanner;

public class Checagem {

	public String checagemInicial(String verdade1, String verdade2, String caracteristica, Scanner read) {
		
		
		
		do {
			System.out.println("Digite se o animal é "+ verdade1 + " ou "+ verdade2 +": ");
			caracteristica = read.nextLine();
			
		} while (!(checarSeVale(verdade1, verdade2, caracteristica)));
		
		
		return caracteristica;
		
	}

	public boolean checarSeVale(String verdade1, String verdade2, String afirmativa) {

		if (!(afirmativa.equalsIgnoreCase(verdade1) && afirmativa.equalsIgnoreCase(verdade1))) {
			return false;
		}

		return true;

	}

}
