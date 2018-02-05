package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		double a;
		double b;
		double gip;
		double trsq;
		a = readFromConsole("Введите а:");
		b = readFromConsole("Введите b:");
		gip = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))); // с=√(a^2+b^2 )
		trsq = (a * b) / 2;
		System.out.println("Гиппотенуза равна:=" + gip + " Площадь треугольника равна:=" + trsq);
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