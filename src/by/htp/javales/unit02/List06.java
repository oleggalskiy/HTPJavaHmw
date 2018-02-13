package by.htp.javales.unit02;

import java.util.Scanner;

public class List06 {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;

		x = readFromConsole();
		y = calcY(x);
		printResult(x, y);

		x = readFromConsole();
		y = calcY(x);
		printResult(x, y);

	}

	public static double calcY(double x) {
		double fx;
		if (x >= 3) {
			fx = -x * x + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		return fx;
	}

	@SuppressWarnings("resource")
	public static double readFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.print("¬ведите значение x:");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите x:");
		}
		x = sc.nextInt();

		return x;
	}

	public static void printResult(double x, double y) {
		System.out.println("y(" + x + ")=" + y + ";");
	}
}
