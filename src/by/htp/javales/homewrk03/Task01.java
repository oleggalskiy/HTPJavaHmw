package by.htp.javales.homewrk03;

import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int[][] matrix = createMatrix();

		printMatrix(matrix);

		findMaxofElem(matrix);

}

	public static int[][] createMatrix() {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int n = 0;

		System.out.println("Введите размер матрицы NxN: ");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n == 0) {
					System.out.println("Размер матрицы должен быть > 0.");
				} else {
					break;
				}
			} else {
				System.out.println("Введите целое значение N: ");
				sc.next();
			}
		}

		int[][] newMtx = new int[n][n];

		for (int i = 0; i < newMtx.length; i++) {
			for (int j = 0; j < newMtx[i].length; j++) {
				newMtx[i][j] = rand.nextInt(10);
			}
		}

		return newMtx;
	}

	public static void printMatrix(int[][] mtx) {
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {

				System.out.printf("%3d", mtx[i][j], "%n");
			}
			System.out.println("");
		}
	}

	public static void findMaxofElem(int[][] mtrx) {
		

		for (int i = 0; i < mtrx.length; i++) {
				 int maxLine = mtrx[i][0];
			for (int j = 0; j < mtrx[i].length; j++) {

				if (maxLine < mtrx[i][j]) {
					maxLine = mtrx[i][j];

				}
			}
			System.out.println("Максимальный элемент в строке " + i + " : = " + maxLine);
		}
		System.out.println("");

		for (int j = 0; j < mtrx[0].length; j++) {
			int maxCol = mtrx[0][j];
			for (int i = 0; i < mtrx.length; i++) {
				if (maxCol < mtrx[i][j]) {
					maxCol = mtrx[i][j];
				}
			}
			System.out.println("Максимальный элемент в столбце " + j + " : = " + maxCol);

		}
	}
}

	

