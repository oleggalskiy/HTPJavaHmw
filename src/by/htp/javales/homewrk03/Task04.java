package by.htp.javales.homewrk03;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Student[] studs = new Student[5];

		studs[0] = new Student(1, "Петров", "Василий", "Александрович", "31.12.1995", "ул. Центральная д. 35",
				"123-45-67", "ФИНО", 3);
		studs[1] = new Student(2, "Харитонов", "Петр", "Александрович", "21.08.1996", "ул. Цветная д. 15", "813-42-67",
				"ФИТУ", 2);
		studs[2] = new Student(3, "Власенко", "Артем", "Алексеевич", "01.11.1998", "ул. Социлистическая д. 25",
				"313-45-77", "ФИТУ", 1);
		studs[3] = new Student(4, "Хитров", "Василий", "Александрович", "21.02.1995", "ул. Центральная д. 1",
				"133-15-62", "ФИНО", 3);
		studs[4] = new Student(5, "Петров", "Василий", "Петрович", "29.09.1995", "пер. Бульварный д. 5", "323-45-67",
				"ФИНО", 3);

		ArrayList<Customer> customs = new ArrayList<>();
		customs.add(new Customer(1, "Иванов", "Николай", "Петрович", "ул. Ленина д. 23", "123456789", "A369B258C147"));

		customs.add(
				new Customer(2, "Пертов", "Иван", "Петрович", "ул. Заречинская д. 33", "321456789", "В169B258C147"));

		customs.add(new Customer(3, "Сидоров", "Александр", "Сергеевич", "ул. Розы д. 1", "662456789", "A279B258C147"));

		customs.add(
				new Customer(4, "Вятич", "Сергей", "Иванович", "ул. Центральная д. 14", "798456789", "A909B258C147"));

		customs.add(
				new Customer(5, "Полянов", "Николай", "Маратович", "ул. Победы д. 77", "553456789", "A129B258C147"));

		printRez(choseCriterion(), studs, customs);

	}

	private static boolean choseCriterion() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean crit = false;
		System.out.println("Выбере цифру для выбора данных о : [1]-Students [2]- Customers");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				switch (sc.nextInt()) {
				case 1:
					crit = true;
					return crit;
				case 2:
					crit = false;
					return crit;
				default:
					System.out.println("[1]-Students [2]- Customers");
					continue;
				}
			}
			System.out.println("Введите в консоль целое число");
			sc.next();
		}
		return crit;
	}

	private static void printRez(boolean crit, Student[] studs, ArrayList<Customer> customs) {
		if (crit == true) {
			for (Student s : studs) {
				s.show();
			}
		} else {
			for (Customer c : customs) {
				c.show();

			}
		}
	}
}
