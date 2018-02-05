package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		double x;
		double func;
		
		x = readFromConsole("Введите значение х: ");
		
		if (x<= -3) {
			func= 9;
			System.out.println("Значение функции: "+func);
		}else {
			func = 1/(x*x+1);
			System.out.println("Значение функции: "+func);
		}
		

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
		while ((x< 3) && (x>-3))  {
			System.out.println("Значение должно быть x <= -3 или x > 3 ");
			x = sc.nextDouble();
		}
		return x;
	}

}
