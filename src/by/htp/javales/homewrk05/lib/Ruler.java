package by.htp.javales.homewrk05.lib;

public class Ruler extends Accessories {

	private int length;

	public Ruler(int _length) {
		setLength(_length);
		name = "Линейка";
		price = 7;
	}

	@Override
	public void doAction() {
		System.out.println("Измеряет что-то");

	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Длинна: " + length + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
