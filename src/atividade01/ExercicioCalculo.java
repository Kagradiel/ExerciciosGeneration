package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculo {

	public void calculo() {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);

		float[] valores = new float[4];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor n" + (i + 1) + ": ");
			valores[i] = read.nextFloat();
			if (i == 1 || (i % 2 != 0 && i > 1)) {
				valores[i] *= valores[i - 1];
			}
			if (i % 2 != 0 && i > 1) {
				valores[0] = valores[1] - valores[i];
			}
		}

		System.out.printf(Locale.US, "Valor obtido: %.1f%n", valores[0]);

		read.close();

		// acho que deixei mais complexo do que deveria kkkkk
	}

}
