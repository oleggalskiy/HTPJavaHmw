package by.htp.javales.homewrk03;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int k = enterK();

		Fraction[] fracts1 = new Fraction[k];
		for (int i = 0; i<fracts1.length; i++ ) {
			fracts1[i] = enterFracrion();
		}
		
	
		for (Fraction fr : fracts1) {
			System.out.println("[" + fr + "]");
		}

	}

	public static int enterK() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите длинну массива дробей");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				if (k > 0) {
					break;
				} else {
					System.out.println("Число должно быть больше 0");
					continue;
				}
			} else {
				System.out.println("Введите челое число: ");
				sc.next();
			}

		}
		return k;
	}

	public static Fraction enterFracrion() {
		int m = 0;
		int n = 1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите числитель дроби: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				m = sc.nextInt();
				break;
			} else {
				System.out.println("Введите челое число: ");
				sc.next();
			}
		}
		
		System.out.println("Введите знаменатель дроби: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				break;
			} else {
				System.out.println("Введите челое число: ");
				sc.next();
			}

		}
		Fraction newFraction = new Fraction(m, n);
		return newFraction;
	}

}
