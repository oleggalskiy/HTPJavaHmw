package by.htp.javales.homewrk05.lib;

public class Copybook extends Book {

	private String type;

	public Copybook(String _type, Integer _pages) {
		super();

		if (_pages == 12) {
			name = "Тетрадь простая";
			pages = _pages;
			price = 5;
		}
		if (_pages > 12 && _pages <= 48) {
			name = "Тетрадь полуобщая";
			pages = _pages;
			price = 10;
		} else {
			name = "Тетрадь общая";
			pages = _pages;
			price = 15;
		}

		type = _type;

	}
	@Override
	public void doAction() {
		String tmpText = "bla...bla...bla";
		System.out.println(tmpText);

	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Тип: " + type + " ]");
		System.out.println("[ Количество страниц: " + pages + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}

}
