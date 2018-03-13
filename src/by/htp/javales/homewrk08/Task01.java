package by.htp.javales.homewrk08;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Matrix matrix = new Matrix(enterData("Введите размерность матрицы NxN:"));
		int countOfTreads = enterData("Введите количество потоков:");
		Thread[] threads = new Thread[countOfTreads];

		for (int i = 0; i <= threads.length - 1; i++) {
			threads[i] = new Thread(new NumberThread((i + 1), matrix));
			threads[i].start();

		}
		
		matrix.printMatrix();

	}

	public static int enterData(String msg) {
		int result = 0;
		String msg1 = "Введите целое положительное число:";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(msg);
			while (!sc.hasNextInt()) {
				System.out.print(msg1);
				sc.next();
			}
			result = sc.nextInt();
		} while (result <= 0);
		return result;
	}

}
