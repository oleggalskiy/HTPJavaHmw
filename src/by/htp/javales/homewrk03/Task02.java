package by.htp.javales.homewrk03;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int[][] mtx = createMatrix();

		for (int[] i : mtx) {
			for (int j : i) {

				System.out.printf("%3d", j);
			}
			System.out.println();

		}
		int[] numberArr = numberOfSwitch();
		int k = numberArr[0] - 1;
		int l = numberArr[1] - 1;

		// System.out.println("k: =" + k + "; l:=" + l);

		switchMtrx(l, k, numberArr, mtx);

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

	public static void switchMtrx(int k, int l, int[] arr, int[][] newMtx) {
		int tmp = 0;

		for (int j = 0; j < newMtx[0].length; j++) {
			tmp = newMtx[k][j];
			newMtx[k][j] = newMtx[l][j];
			newMtx[l][j] = tmp;
		}
		for (int[] i : newMtx) {
			for (int j : i) {

				System.out.printf("%3d", j);
			}
			System.out.println();

		}
	}

	public static int[] numberOfSwitch() {

		int[] arNumber = new int[2];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите номера строк которые нужно поменять местами:");

		for (int i = 0; i < arNumber.length; i++) {
			System.out.print("№: " + i + "-ой строки ");
			while (sc.hasNext()) {
				if (sc.hasNextInt()) {
					arNumber[i] = sc.nextInt();
					if (arNumber[i] > 0) {
						break;
					} else {
						System.out.println("Введите значение > 0");
					}
				} else {
					System.out.println("Введите целое число: ");
					sc.next();
				}
			}
		}
		return arNumber;

	}
}
