package atividade02.models;

public class ContaBancariaModel {
	
	public static class Conta {

		private float saldo;

		public Conta(float saldo) {
			this.saldo = saldo;
		}

		public float getSaldo() {
			return saldo;
		}

		public void depositar(float deposito) {
			this.saldo = saldo + deposito;
			System.out.println("\nOperação - Depósito\n"
					 		 + "Novo Saldo: R$" + saldo + "\n");
		}
		
		public void sacar(float saque) {
			if(saque > saldo) {
				System.out.println("\nOperação - Saque\n"
						 		 + "Saldo Insuficiente!\n");
			}else {
				this.saldo = saldo - saque;
				System.out.println("\nOperação - Saque\n"
						 		 + "Novo Saldo: R$" + saldo + "\n");
			}
		}
		

	}
}
