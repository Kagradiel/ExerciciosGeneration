package atividade01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalario {
	public void lerSalario() {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);
		//useLocale usado para fixar o uso do ponto ao invés da virgula
		
		float salario = 0f;
		
		System.out.println("Digite o Salário: ");
		salario = read.nextFloat();
		
		System.out.println("Digite o Abono: ");
		salario += read.nextFloat();
		
		System.out.println("Novo salário: " + salario);
		
		read.close();
	}
}
