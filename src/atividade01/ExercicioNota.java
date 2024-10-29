package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNota {

	public void devolverMedia() {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);

		float[] notas = new float[4];
		float media = 0f;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
			notas[i] = read.nextFloat();
			media += notas[i];
		}

		media = media / notas.length;

		System.out.printf(Locale.US, "Media de notas: %.1f%n", media);

		read.close();

	}

}
