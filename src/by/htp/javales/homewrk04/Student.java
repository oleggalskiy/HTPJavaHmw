package by.htp.javales.homewrk04;

public class Student {

	private int id;
	private String name;
	private String surName;
	private int idGroup;
	private double sesRating1;
	private double sesRating2;
	private double sesRating; 

	public Student() {
		id = 0;
		name = null;
		surName = null;
		idGroup = 0;
		sesRating1 = 0;
		sesRating2 = 0;
		sesRating = 0;
	}

	public Student(int id, String name, String surName, int group, double sesRating1, double sesRating2) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.idGroup = group;
		this.sesRating1 = sesRating1;
		this.sesRating2 = sesRating2;
		this.sesRating = findSesRating();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getGroup() {
		return idGroup;
	}

	public void setGroup(int group) {
		this.idGroup = group;
	}

	public double getSesRating1() {
		return sesRating1;
	}

	public void setSesRating1(double sesRating1) {
		this.sesRating1 = sesRating1;
	}

	public double getSesRating2() {
		return sesRating2;
	}

	public void setSesRating2(double sesRating2) {
		this.sesRating2 = sesRating2;
	}
	
	public double getSesRating() {
		return sesRating;
	}

	public void printStudent(Student stud) {			// метод который выводит все данные о студенте в консоль
		System.out.println("-----------------------");
		System.out.println("[id: " + id + "]");
		System.out.println("[Имя: " + name + "]");
		System.out.println("[Фамилия: " + surName + "]");
		System.out.println("[Группа: " + idGroup + "]");
		System.out.println("[Балл за первую сессию: " + sesRating1 + "]");
		System.out.println("[Балл за вторую сессию: " + sesRating2 + "]");
		System.out.println("[Средний балл студента: " + sesRating + "]");

	}
		private double findSesRating() {				// метод который находит средний бал студента
			double sesRating = (sesRating1+sesRating2)/2;			
		return sesRating;
	}
	
	
}
