package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalarioLiquido {

	public void salarioLiquido() {
		//apesar de não ser mt escalavel fiz dessa maneira usando o minimo de variaveis
		
				Scanner read = new Scanner(System.in).useLocale(Locale.US);
				
				float salario = 0f;
				
				System.out.println("Digite seu salario: ");
				salario = read.nextFloat();
				
				System.out.println("Digite seu adicional noturno: ");
				salario += read.nextFloat();
				
				System.out.println("Digite as horas extras: ");
				salario += read.nextFloat() * 5;
				
				System.out.println("Digite os descontos: ");
				salario -= read.nextFloat();
				
				System.out.printf(Locale.US, "Salario líquido: %.2f%n",  salario);
				
				read.close();
	}
}
