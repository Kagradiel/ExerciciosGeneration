package atividade02;

import java.util.Scanner;

public class DoarSangue {

	public void aptoOuNao() {

		Scanner read = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		char jaDoou = 'o';
		boolean doou = true;

		System.out.println("Cadastre-se para checar aptidão para doação\n");

		System.out.println("Digite seu nome: ");
		nome = read.nextLine();

		System.out.println("Digite sua idade: ");
		idade = read.nextInt();

		System.out.println("Já doou sangue?\n (s)sim   (n)não");
		jaDoou = read.next().charAt(0);

		while (jaDoou != 's' && jaDoou != 'n') {
			System.out.println("Digite um valor valido \n");
			System.out.println("Já doou sangue?\n (s)sim   (n)não");
			jaDoou = read.next().charAt(0);
		}
		
		if(jaDoou == 'n')
			doou = false;

		if ((idade >= 60 && doou == true) || 
			(idade <= 69 && doou == true) || 
			(idade > 17 || idade < 60)) {
			
			System.out.println("Que bom "+ nome +", você pode doar");
		
		} else {
			System.out.println("Lamento "+ nome +", você não pode doar");
		}

		read.close();

	}
}
