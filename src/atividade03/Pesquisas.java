package atividade03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividade03.models.PesquisaModel.Colaborador;
import atividade03.services.ResultadoFiltradoPesquisa;

public class Pesquisas {

	public void generoEStack() {

		try (Scanner read = new Scanner(System.in)) {

			char continuar = 'S';
			int idade = 0, genero = 0, cargo = 0;

			List<Colaborador> colaboradores = new ArrayList<Colaborador>();

			while (continuar == 'S' || continuar == 's') {
				
				System.out.println("Qual é a sua idade: ");
				idade = read.nextInt();
				
				System.out.println("\nQual seu genero: \n" 
								 + "1 - Mulher Cis\n"
								 + "2 - Homem Cis\n" 
								 + "3 - Não Binário \n" 
								 + "4 - Mulher Trans\n"
								 + "5 - Homem Trans\n"
								 + "6 - Outros\n");
				genero = read.nextInt();
				
				System.out.println("\nQual sua stack: \n" 
						 		 + "1 - Backend\n"
						 		 + "2 - Frontend\n" 
						 		 + "3 - Mobile \n" 
						 		 + "4 - FullStack\n");
				cargo = read.nextInt();
				
				
				Colaborador colaborador = new Colaborador(idade, genero, cargo);
				colaboradores.add(colaborador);

				System.out.println("Deseja continuar (S/N): ");
				continuar = read.next().charAt(0);
				System.out.println("\n\n");

			}
	
			
			ResultadoFiltradoPesquisa resultado = new ResultadoFiltradoPesquisa();
			resultado.resultado(colaboradores);
			
			
			read.close();
		}
	}

}
