package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task033 {

	public static void main(String[] args) {
		double[] Arr = initArr();
		printArr(Arr);
		findIncreasingArr(Arr);

	}

	public static double[] initArr() {
		int n = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество элементов массива:");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0) {
					break;
				} else {
					System.out.println("Значание должно быть > 0 ");
				}
			} else {
				System.out.println("Вы не ввели целочисленное значение. Попробуйте ещё раз.");
				sc.next();
			}
		}

		double[] arr = new double[n];

		System.out.println("Введите значение элементов массива:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Введите значение элемента [" + i + "] массива:");

			while (sc.hasNext()) {
				if (sc.hasNextDouble()) {
					arr[i] = sc.nextDouble();
					break;
				} else {
					System.out.println("Введите действительное число.");
					sc.next();
				}
			}
		}
		return arr;
	}

	public static void printArr(double[] arr) {

		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "]");
		}
		System.out.println("");
	}

	public static void findIncreasingArr(double[] Arr) {

		int i;

		for (i = 1; i < Arr.length; i++) {
			if (Arr[i - 1] >= Arr[i]) {
				break;
			}
		}
		if (i < Arr.length) {
			System.out.println("Масcив -  не строго возрастающая последовательность чисел");
		} else {
			System.out.println("Масcив -  строго возрастающая последовательность чисел");
		}
	}

}
