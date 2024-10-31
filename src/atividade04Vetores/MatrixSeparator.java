package atividade04Vetores;

public class MatrixSeparator {

	public void mainDiagonal(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			System.out.print(matrix[i][i] + " ");

		}

	}

	public void secondaryDiagonal(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			System.out.print(matrix[i][(matrix.length-1) - i] + " ");

		}

	}

	public int mainDiagonalSum(int[][] matrix) {

		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {

			sum += matrix[i][i];

		}

		return sum;

	}

	public int secondaryDiagonalSum(int[][] matrix) {

		int soma = 0;

		for (int i = 0; i < matrix.length; i++) {

			soma += matrix[i][(matrix.length-1) - i];

		}

		return soma;

	}

}
