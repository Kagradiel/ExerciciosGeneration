package atividade02;

import java.util.Scanner;

import atividade02.services.Checagem;

public class ComparadorDeStrings {

	public void comparadorDeStrings() {

		Checagem checar = new Checagem();
		Scanner read = new Scanner(System.in);
		
		String[] caracteristicas = new String[3];

		caracteristicas[0] = checar.checagemInicial("vertebrado", "invertebrado", caracteristicas[0], read);
		

		if (caracteristicas[0].equalsIgnoreCase("vertebrado") ) {

			caracteristicas[1] = checar.checagemInicial("ave", "mamifero", caracteristicas[1], read);

			if (caracteristicas[1].equalsIgnoreCase("ave")) {
				caracteristicas[2] = checar.checagemInicial("carnivoro", "onivoro", caracteristicas[2], read);

				System.out.println((caracteristicas[2].equalsIgnoreCase("carnivoro")) ? "Aguia" : "Pomba");

			} else {
				caracteristicas[2] = checar.checagemInicial("herbivoro", "onivoro", caracteristicas[2], read);

				System.out.println((caracteristicas[2].equalsIgnoreCase("onivoro")) ? "Homem" : "Vaca");
			}

		} else {

			caracteristicas[1] = checar.checagemInicial("inseto", "anelideo", caracteristicas[1], read);

			if (caracteristicas[1].equalsIgnoreCase("inseto")) {
				caracteristicas[2] = checar.checagemInicial("onivoro", "hematofago", caracteristicas[2], read);

				System.out.println((caracteristicas[2].equalsIgnoreCase("hematofago")) ? "Pulga" : "Lagarta");
			} else {
				caracteristicas[2] = checar.checagemInicial("herbivoro", "hematofago", caracteristicas[2], read);

				System.out.println((caracteristicas[2].equalsIgnoreCase("hematofago")) ? "Sanguessuga" : "Minhoca");
			}

		}

		read.close();
	}
}
