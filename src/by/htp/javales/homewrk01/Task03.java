package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rezbc;
		double rezabc;

		a = readFromConsole("Введите число a:");
		b = readFromConsole("Введите число b:");

		if (a > b) {
			c = readFromConsole("Введите число с");
			rezbc = b + c;
			System.out.println("Результат b+c:=" + rezbc);
		}

		if (a == b) {
			System.out.println("Конец");
		}
		if (a < b) {
			c = readFromConsole("Введите число с");
			rezabc = a + b + c;
			System.out.println("a+b+c=" + rezabc + " Новый год!");
		}
	}
	public static double readFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double d = 0;
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}
		d = sc.nextDouble();
		while (d <= 0) {
			System.out.println("Введите значение больше или не равное нулю!" + message);
			d = sc.nextDouble();
		}
		System.out.println("Значение принято.");
		return d;
	}
}
