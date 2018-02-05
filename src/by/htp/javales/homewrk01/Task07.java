package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double rez;
		a = readFromConsole("Введите значение а:");
		b = readFromConsole("Введите значение b:");
		c = readFromConsole("Введите значение c:");
		d = readFromConsole("Введите значение d:");
		rez = (a / c * b / d) - (a * b - c) / (c * d);
		// Для проверки порядка действий
		/*System.out.println("Значение выражения a/c=" + (a / c));
		System.out.println("Значение выражения b/d=" + (b / d));
		System.out.println("Значение выражения a*b-c=" + (a * b - c));
		System.out.println("Значение выражения c*d =" + (c * d));*/
		System.out.println("Значение выражения =" + rez);

	}

	public static double readFromConsole(String message) {

		double x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите корректное значение!");
		}
		x = sc.nextDouble();
		while (x == 0) {
			System.out.println("Значение должно быть не равным 0!");
			sc.next();
			x = sc.nextDouble();
		}
		return x;
	}
}
