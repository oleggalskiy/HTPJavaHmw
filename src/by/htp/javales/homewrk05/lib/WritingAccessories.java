package by.htp.javales.homewrk05.lib;

public class WritingAccessories extends Accessories {

	@Override
	public void doAction() {
		write();
		
	}
	
	public void write() {
		System.out.println("make: Kalaki- malaki");
		
	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Цена: " + price + " ]");
	}

	
}
