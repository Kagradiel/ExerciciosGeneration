package atividade03;

import java.util.Scanner;

public class Separador {
	
	public void porIdade() {
		
		Scanner read = new Scanner(System.in);
		
		int menorDe21 = 0, maiorDe50 = 0, idade = 0;
		
		System.out.println("Separador de idade\n");
		
		while(!(idade < 0)){
			
			System.out.println("Digite uma idade: \n"
						 	 + "Para terminar digite um numero negativo");
			
			idade = read.nextInt();
			
			System.out.println("\n");
			
			if(idade > 50)
				maiorDe50++;
			else if(idade < 21 && idade > 0)
				menorDe21++;
			
			
			
		};
		
		System.out.println("Total de pessoas menores de 21 anos: " + menorDe21 
						 + "\nTotal de pessoas maiores de 50 anos: " + maiorDe50);
		
		read.close();
	}

}
