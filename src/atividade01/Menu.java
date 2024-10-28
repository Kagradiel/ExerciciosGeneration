package atividade01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		short menu = 0;
		
		System.out.println("Voce deseja acessar qual atividade: \n"
				+ "1 - Leitura de notas\n"
				+ "2 - Calculo de media\n"
				+ "3 - Calculo de salario\n"
				+ "4 - Calculo sem contexto kkkk");
		
		System.out.println("\n\nQual atividade você quer realizar: ");
		menu = read.nextShort();
		
		switch(menu) {
		
		case 1:
			ExercicioSalario exercicioSalario = new ExercicioSalario();
            exercicioSalario.lerSalario();           
			break;
			
		case 2:
			ExercicioNota exercicioNota = new ExercicioNota();
            exercicioNota.lerNotas();   
			break;
			
		case 3:
			ExercicioSalarioLiquido salarioLiquido = new ExercicioSalarioLiquido();
			salarioLiquido.salarioLiquido();
			break;
			
		case 4:
			ExercicioCalculo calculo = new ExercicioCalculo();
			calculo.calculo();
			break;
		
		default:
			System.out.println("Valor invalido");
			break;
		}
		
		read.close();
		
		
	}

}
