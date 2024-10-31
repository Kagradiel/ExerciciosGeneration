package atividade04Vetores;

public class SeparadorMatriz {

	public void diagonalPrincipal(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			System.out.print(matriz[i][i] + " ");

		}

	}

	public void diagonalSecundaria(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			System.out.print(matriz[i][(matriz.length-1) - i] + " ");

		}

	}

	public int somaDiagonalPrincipal(int[][] matriz) {

		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {

			soma += matriz[i][i];

		}

		return soma;

	}

	public int somaDiagonalSecundaria(int[][] matriz) {

		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {

			soma += matriz[i][(matriz.length-1) - i];

		}

		return soma;

	}

}
