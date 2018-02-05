package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int countNumb;
		int tmp = 0;
		int countModless3 = 0;
		int sumMul3 = 0;
		int countEven = 0;

		countNumb = enterCountNumb();
		for (int i = 0; i < countNumb; i++) {
			tmp = enterNumb();
			if (tmp % 2 == 0) {
				countEven++;
			}
			if (tmp % 3 == 0) {
				sumMul3 = sumMul3 + tmp;
			}
			if (Math.abs(tmp) < 3) {
				countModless3++;
			}

		}
		System.out.println("Колличество четных чисел:= " + countEven);
		System.out.println("Сумма кратных 3 := " + sumMul3);
		System.out.println("Количество чисел модуль которых < 3:= " + countModless3);
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

	public static int enterNumb() { // Вводим знеачения цифр с консоли
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int d;

		System.out.println("Введите число:");
		while (!sc2.hasNextInt()) {
			System.out.println("Введите целое число");
			sc2.next();
		}
		d = sc2.nextInt();
		return d;
	}

}
