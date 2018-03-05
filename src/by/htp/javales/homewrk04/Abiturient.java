package by.htp.javales.homewrk04;

public class Abiturient  {

	private int id;
	private String name;
	private String surName;
	private int[] rating;
	private double midRating;

	public Abiturient() {
		id = 0;
		name = null;
		surName = null;
		rating = null;
	}

	public Abiturient(int _id, String _surName, String _name, int a, int b, int c, int d) {
		this.id = _id;
		this.name = _name;
		this.surName = _surName;
		this.rating = new int[] { a, b, c, d };
		this.midRating = findMidRating();
	}

	public void printAbiturient() {
		System.out.println("-----------------------");
		System.out.println("[id: " + id + "]");
		System.out.println("[Фамилия: " + surName + "]");
		System.out.println("[Имя: " + name + "]");
		System.out.println(
				"[Оценки при поступлении: " + rating[0] + ", " + rating[1] + ", " + rating[2] + ", " + rating[3] + "]");
		System.out.println("[Средний балл студента: " + midRating + "]");
	}

	private double findMidRating() { // метод вычисляет средний балл студента
		double tmp = 0;
		for (int i : rating) {
			tmp += i;
		}
		tmp = tmp / rating.length;
		return tmp;
	}

	

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public double getMidRating() {
		return midRating;
	}

}
