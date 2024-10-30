package atividade03.services;

import java.util.List;

import atividade03.models.PesquisaModel.Colaborador;

public class ResultadoFiltradoPesquisa {

	public void resultado(List<Colaborador> colaboradores) {
		
		int filtroMulheres = 0, filtroHomens = 0, filtroNb = 0, backenders = 0;
		float somaIdades = 0;
		
		for (int i = 0; i < colaboradores.size(); i++) {

			if (colaboradores.get(i).getGenero() == 1 && colaboradores.get(i).getGenero() == 4
					&& colaboradores.get(i).getCargo() == 2) {

				filtroMulheres++;

			}

			if (colaboradores.get(i).getGenero() == 2 && colaboradores.get(i).getGenero() == 5
					&& colaboradores.get(i).getCargo() == 3 && colaboradores.get(i).getIdade() > 40) {

				System.out.println(colaboradores.get(i).getGenero() + colaboradores.get(i).getCargo() + colaboradores.get(i).getIdade() );
				
				filtroHomens++;

			}

			if (colaboradores.get(i).getGenero() == 3 && colaboradores.get(i).getIdade() < 30
					&& colaboradores.get(i).getCargo() == 2) {

				filtroNb++;

			}

			if (colaboradores.get(i).getCargo() == 1) {
				backenders++;
			}

			somaIdades += (float) colaboradores.get(i).getIdade();

		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backenders);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + filtroMulheres);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + filtroHomens);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + filtroNb);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: " + colaboradores.size());
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa: "+ (somaIdades / colaboradores.size()));

		
	}
	
}
