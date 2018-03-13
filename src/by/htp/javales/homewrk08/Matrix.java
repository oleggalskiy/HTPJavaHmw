package by.htp.javales.homewrk08;

public class Matrix {

	private int[][] matrix;

	public Matrix() {
		matrix = new int[5][5];
	}

	public Matrix(int n) {

		matrix = new int[n][n];
	}

	public synchronized void printMatrix() {
		for (int[] mti : matrix) {
			for (int mtj : mti) {
				System.out.print("[ " + mtj + " ]");
			}
			System.out.println();
		}
	}

	public int[][] getMatrix() {
		return matrix;
	}
}
