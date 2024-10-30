package atividade02;

import java.util.Locale;
import java.util.Scanner;

public class ReajusteDeSalario {
	
	public void reajuste() {
		
		Scanner read = new Scanner(System.in).useLocale(Locale.US);

		byte cargo = 0;
		String nome ="";
		float salario = 0f;
		

		System.out.println("Reajuste de salario\n");
		
		System.out.println("Digite seu nome: ");
		nome = read.nextLine();
		
		System.out.println("Digite seu salario: ");
		salario = read.nextFloat();
		
		System.out.println("Qual seu Cargo: \n" 
							+ "1 - Gerente      10% \n"
							+ "2 - Vendedor      7% \n" 
							+ "3 - Supervisor    9% \n" 
							+ "4 - Motorista     6% \n"
							+ "5 - Estoquista    5% \n"
							+ "6 - Técnico de TI 8% ");

		cargo = read.nextByte();
		
		switch(cargo) {
		
		case 1:
			System.out.println("\n" + nome +"\nCargo: Gerente" );
			System.out.println("Salario: " + (salario + (salario * 0.10)));
			break;
			
		case 2:
			System.out.println("\n" + nome +"\nCargo: Vendedor" );
			System.out.println("Salario: " + (salario + (salario * 0.7)));
			break;
			
		case 3:
			System.out.println("\n" + nome +"\nCargo: Supervisor" );
			System.out.println("Salario: " + (salario + (salario * 0.9)));
			break;
			
		case 4:
			System.out.println("\n" + nome +"\nCargo: Motorista" );
			System.out.println("Salario: " + (salario + (salario * 0.6)));
			break;
			
		case 5:
			System.out.println("\n" + nome +"\nCargo: Estoquista" );
			System.out.println("Salario: " + (salario + (salario * 0.5)));
			break;
			
		case 6:
			System.out.println("\n" + nome +"\nCargo: Técnico de TI" );
			System.out.println("Salario: " + (salario + (salario * 0.8)));
			break;
			
		default:
			System.out.println("Caso inválido");
			break;
		}
		
		read.close();
		
		
	}
	
	
	
}
