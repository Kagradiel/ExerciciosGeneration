package atividade02;

import java.util.Locale;
import java.util.Scanner;

import atividade02.models.ContaBancariaModel.Conta;

public class Banco {

	public void contaBancaria() {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);

		byte menu = 0;
		float valorAlterar = 0;

		do {
			
			System.out.println("Qual opção você deseja acessar: \n" 
					 + "0 - Saldo\n" 
					 + "1 - Saque\n" 
					 + "2 - Deposito \n"
					 + "3 - Finalizar Operação");
			
			menu = read.nextByte();

			Conta contaBase = new Conta(1000f);
			
			if(menu == 1 || menu == 2) {
				System.out.println("Digite o valor: ");
				valorAlterar = read.nextFloat();
			}
			
			switch (menu) {

			case 0:
				System.out.println("\nOperação - Saque\n" + "Saldo: R$" + contaBase.getSaldo()+"\n");
				break;

			case 1:
				contaBase.sacar(valorAlterar);
				break;

			case 2:
				contaBase.depositar(valorAlterar);
				break;
			
			case 3:
				System.out.println("Operações finalizadas");
				break;

			default:
				System.out.println("Operação Invalida");
				break;
			}

		} while (menu != 3);

		read.close();

	}
}
