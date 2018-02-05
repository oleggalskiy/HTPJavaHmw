package by.htp.javales.homewrk01;
import java.util.Scanner;


public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double frm;
		System.out.println("Вычисляем формулу: a^2-(b-c)^2+ln(b^2-1)");
		a = readFromConsole("Введите число a:");
		b = readFromConsole("Введите число b:");
		c = readFromConsole("Введите число с");
		frm = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);
		System.out.println("Результат:=" + frm);
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
