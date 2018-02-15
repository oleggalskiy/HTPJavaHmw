package by.htp.javales.homewrk03;

public class Task04 {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student(1, "Петров", "Василий", "Александрович", "31.12.1995", "ул. Центральная д. 35", "123-45-67", "ФИНО", 3);
		
		student.show();
		student1.show();
		
		Customer customer1 = new Customer(1, "Иванов", "Николай", "Петрович", "ул. Ленина д. 13", "123456789", "A369B258C147");
		
		customer1.show();
		customer1.closeAccount();
		customer1.changeCardNumber();
		customer1.show();
		customer1.setCardNumber("n/a");
		customer1.closeAccount();
		customer1.show();
		customer1.closeAccount();
		customer1.changeCardNumber();
	}

}
