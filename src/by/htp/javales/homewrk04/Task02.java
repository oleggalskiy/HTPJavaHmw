package by.htp.javales.homewrk04;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Task02 {

	public static void main(String[] args) {
		List<Abiturient> abits = new ArrayList<Abiturient>();
		List<Abiturient> abitsSurvive = new ArrayList<Abiturient>();

		abits.add(new Abiturient(1, "Шишков", "Вячеслав", 5, 4, 4, 5));
		abits.add(new Abiturient(2, "Старостин", "Сергей", 3, 4, 4, 5));
		abits.add(new Abiturient(3, "Лебедева", "Елена", 4, 4, 4, 4));
		abits.add(new Abiturient(4, "Вязин", "Николай", 3, 4, 4, 5));
		abits.add(new Abiturient(5, "Титова", "Ольга", 5, 4, 4, 5));
		abits.add(new Abiturient(6, "Амуров", "Петр", 5, 5, 4, 5));
		abits.add(new Abiturient(7, "Шейко", "Артем", 5, 3, 4, 5));
		abits.add(new Abiturient(8, "Мирин", "Глеб", 5, 3, 4, 5));
		abits.add(new Abiturient(9, "Савинов", "Тимур", 5, 4, 4, 3));
		abits.add(new Abiturient(10, "Хазиров", "Артем", 5, 4, 3, 5));
		abits.add(new Abiturient(11, "Шарова", "Татьяна", 5, 4, 4, 5));
		abits.add(new Abiturient(12, "Свитин", "Павел", 4, 4, 4, 4));
		abits.add(new Abiturient(13, "Хромов", "Глеб", 4, 4, 4, 5));
		abits.add(new Abiturient(14, "Ларина", "Александра", 5, 5, 3, 5));
		abits.add(new Abiturient(15, "Лебедева", "Дарья", 4, 4, 4, 4));

		abits.sort(new AbiturientsCompare()); // сортируем список с помощью класса AbiturientsCompare

		abitsSurvive = returnValOfSurvave(abits, chooseValPlaces()); // заполняем список поступившими абитуриентами

		printList(abitsSurvive);
	}

	public static int chooseValPlaces() { // метод запрашивающий у пользователя количество мест для поступающих
											// абитуриентов

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.println("Введите количество мест для поступающих абитуриентов: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				if (k > 0) {
					return k;
				} else {
					System.out.println("Введите целое число:");
					continue;
				}
			} else {
				System.out.println("Введите число:");
				sc.next();
			}
		}
		return 0;
	}

	// метод returnValOfSurvave возвращает список поступивших из всего списка
	// поступивших
	public static List<Abiturient> returnValOfSurvave(List<Abiturient> abits, int value) {

		List<Abiturient> result = new ArrayList<Abiturient>();
		if (value >= abits.size()) {
			result = abits;
			return result;
		}
		for (int i = 0; i < value; i++) {
			result.add(abits.get(i));
		}

		return result;

	}

	public static void printList(List<Abiturient> list) {
		for (Abiturient abt : list) {
			abt.printAbiturient();
		}
	}

}
