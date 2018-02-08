package by.htp.javales.homewrk02;

import java.util.Scanner;

public class Task031 {

	public static void main(String[] args) {
		int k;
		int sum;
		int[] arr = initArr();
		printArr(arr);
		k = initMultiple();
		sum = sumElementsMultiple(k, arr);

		System.out.println("Сумма значений кратных [" + k + "] равна " + sum + " .");

	}

	public static int[] initArr() {
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

		int[] arr = new int[n];
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 1;
		}
		return arr;
	}

	public static void printArr(int[] arr) {

		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-> [" + arr[i] + "]");
		}
		System.out.println("");
	}

	public static int initMultiple() {
		int k = 0;
		System.out.println("Введите значение K: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				if (k > 0) {
					break;
				} else {
					System.out.println("Значение К должно быть больше 0.");
				}
			} else {
				System.out.println("Введите целое число.");
			}
		}
		return k;
	}

	public static int sumElementsMultiple(int k, int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
