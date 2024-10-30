package atividade03.models;

public class PesquisaModel {

	public static class Colaborador {

		private int idade;
		private int genero;
		private int cargo;

		public Colaborador(int idade, int genero, int cargo) {
			this.idade = idade;
			this.genero = genero;
			this.cargo = cargo;
		}

		public int getIdade() {
			return idade;
		}

		public int getGenero() {
			return genero;
		}

		public int getCargo() {
			return cargo;
		}

	}
}
