package by.htp.javales.homewrk04;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

	public static void main(String[] args) {
		List<Student> stds = new ArrayList<Student>();
		Group group1 = new Group(620601);
		Group group2 = new Group(620602);
		Group group3 = new Group(620603);

		stds.add(new Student(1, "Иванов", "Сергей", 620601, 5.0, 5.0));
		stds.add(new Student(2, "Петров", "Кирилл", 620601, 3.0, 3.0));
		stds.add(new Student(3, "Полянов", "Владислав", 620603, 4.0, 5.0));
		stds.add(new Student(4, "Заречная", "Кристина", 620602, 4.0, 3.0));
		stds.add(new Student(5, "Краснов", "Петр", 620603, 3.0, 4.0));
		stds.add(new Student(6, "Стушин", "Олег", 620602, 5.0, 5.0));
		stds.add(new Student(7, "Есненко", "Сергей", 620603, 2.0, 2.0));
		stds.add(new Student(8, "Яночков", "Алексей", 620602, 3.0, 3.0));
		stds.add(new Student(9, "Симоненко", "Стас", 620603, 4.0, 2.0));
		stds.add(new Student(10, "Семенова", "Алина", 620602, 4.0, 4.0));
		stds.add(new Student(11, "Косенко", "Екатерина", 620601, 5.0, 3.0));
		
		

		for (Student tmpStds : stds) { // добавляем студентов в группы
			switch (tmpStds.getGroup()) {
			case 620601:
				group1.addToGroup(tmpStds);
				break;
			case 620602:
				group2.addToGroup(tmpStds);
				break;
			case 620603:
				group3.addToGroup(tmpStds);
				break;
			default:
				System.out.println("Нет такой группы!");
				break;
			}
			
			
			

		}

		group1.printGroup();
		group2.printGroup();
		group3.printGroup();
		
		System.out.println();
		System.out.printf("Средний бал группы:"+ group1.getIdGroup() +" = %.2f",  group1.findRating());
		System.out.println();
		System.out.printf("Средний бал группы:"+ group2.getIdGroup() +" = %.2f",  group2.findRating());
		System.out.println();
		System.out.printf("Средний бал группы:"+ group3.getIdGroup() +" = %.2f",  group3.findRating());
		System.out.println();
		group1.findHonorStuds();
		group2.findHonorStuds();
		group3.findHonorStuds();
		

	}

}
