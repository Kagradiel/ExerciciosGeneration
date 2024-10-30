package atividade02.services;

import java.util.List;
import java.util.Scanner;
import atividade02.models.CarrinhoDeCompras.Produto;

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
	
	public int checarIndice(String comparador, List<Produto> produtos) {
		int index = -1;
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(comparador)) {
				return i;
			}
		}
		
		return index;
	}
	
	
}
