package by.htp.javales.homewrk05.lib;

import java.util.Random;

public class Textbook extends Book {

	public Textbook(String _name) {
		Random rnd = new Random();
		name= _name;
		pages = Integer.valueOf(rnd.nextInt(100) * 10 + 1);
		price = (int) (pages * 0.8);
	}

	@Override
	public void doAction() {
		System.out.println("RTFM");

	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Количество страниц: " + pages + " ]");
		System.out.println("[ Цена: " + price + " ]");
	}

}
