package atividade02;

import java.util.Scanner;

public class MaiorOuMenor {

	public void maiorOuMenor() {

		Scanner read = new Scanner(System.in);

		int[] valores = new int[3];

		System.out.println("Ler dois numeros e comparar a soma com Terceiro valor: \n");

		System.out.println("Digite o valor A para a soma: ");
		valores[0] = read.nextInt();

		System.out.println("Digite o valor B para a soma: ");
		valores[1] = read.nextInt();

		System.out.println("Digite o valor C para comparação: ");
		valores[2] = read.nextInt();

		if ((valores[0] + valores[1]) > valores[2]) {
			System.out.println("A soma resulta em: " + (valores[0] + valores[1]));
			System.out.println("Que é maior que " + valores[2]);

		} else {
			System.out.println("A soma resulta em: " + (valores[0] + valores[1]));
			System.out.println("Que é menor que " + valores[2]);

		}

		read.close();

	}
}
