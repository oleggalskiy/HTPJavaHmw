package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int countNumb;
		int countRez = 0;
		double tmp;

		countNumb = enterCountNumb();
		for (int i = 0; i < countNumb; i++) {
			tmp = enterNumb();
			if (Math.floor(tmp) % 2 == 0) {
				if (Math.floor(tmp) > 15) {
					countRez++;
				}
			}

		}
		System.out.println("Количество четных чисел и чисел >15:= " + countRez);

	}

	public static int enterCountNumb() { // Вводим количество цифр
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int b;

		System.out.println("Введите количество цифр:");
		while (!sc.hasNextInt()) {
			System.out.println("Введите целое число");
			sc.next();
		}
		b = sc.nextInt();
		while (b <= 0) {
			System.out.println("Введите положительное число!!!:");
			b = sc.nextInt();
		}
		return b;
	}

	public static double enterNumb() { // Вводим знеачения цифр с консоли
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		double d;

		System.out.println("Введите число:");
		while (!sc2.hasNextDouble()) {
			System.out.println("Введите вещественное число");
			sc2.next();
		}
		d = sc2.nextDouble();
		return d;
	}
}
