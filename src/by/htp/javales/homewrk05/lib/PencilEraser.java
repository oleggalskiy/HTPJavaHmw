package by.htp.javales.homewrk05.lib;

public class PencilEraser extends WritingAccessories {

	public PencilEraser() {
		name = "Стерка для карандаша";
		price = 4;
	}

	@Override
	public void doAction() {
		System.out.println("Стирает написанное карандашом.");

	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}

}
