package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		double[] arr = initArr();

		findMaxElementAndIndex(arr);
		findMinElementAndIndex(arr);
		printArr(arr);
		sortArray(arr);

	}

	public static void sortArray(double[] arr) {

		int min;
		double tmp;

		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.print("Цикл после сортировки :");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "] ");
		}

	}

	public static void findMinElementAndIndex(double[] arr) {
		double min;
		int index;

		min = arr[0];
		index = 0;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}

		System.out.println("Минимальный элемент -> " + min + " расположен на позиции -> " + index + " .");

	}

	public static void findMaxElementAndIndex(double[] arr) {
		double max;
		int index;

		max = arr[0];
		index = 0;

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Максимальный элемент -> " + max + " расположен на позиции -> " + index + " .");
		System.out.println("------------------------------------------------------------------------------");
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
					System.out.println("Введите вещественное число.");
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
}
