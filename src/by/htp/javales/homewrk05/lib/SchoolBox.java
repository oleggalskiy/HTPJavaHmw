package by.htp.javales.homewrk05.lib;

import java.util.List;

public class SchoolBox extends Accessories{
	
	private List<WritingAccessories> forWritting;
	


	public SchoolBox(List<WritingAccessories> forWritting) {
		super();
		name = "Школьный пенал";
		this.forWritting = forWritting;
		price = 5;
	}

	@Override
	public void doAction() {
		System.out.println("Хранит принадлежности для письма");
		
	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Внутри храниться: " + forWritting + " ]");
		System.out.println("[ Цена: " + price + " ]");
		
		for(WritingAccessories k : forWritting) {
			k.show();
		}
	}

}
