package by.htp.javales.homewrk05;

import java.util.Scanner;

import by.htp.javales.homewrk05.lib.BeginnerSet;

public class Task01 {

	public static void main(String[] args) {
		BeginnerSet set = new BeginnerSet();
		set.selectSort(inputSort());

		set.printSet();
	}

	public static int inputSort() {
		int result = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Для сортировки списка по Цене введите в консоль (1), для сортировки по Наименовнию введите(2), по Цене и Наименованию (3) :");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				if (result == 1 || result == 2 || result == 3) {
					return result;
				} else {
					System.out.println("Введите 1, 2, или 3");
					continue;
				}
			} else {
				System.out.println("Введите целое значение:  1, 2, или 3");
				sc.next();
			}
		}
		return result;

	}
}
