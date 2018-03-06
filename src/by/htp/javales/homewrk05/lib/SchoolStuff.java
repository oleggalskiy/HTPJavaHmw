package by.htp.javales.homewrk05.lib;



public abstract class SchoolStuff {

	protected int id;
	protected String name;
	protected Integer price;
	
	public SchoolStuff(int _id, String _name, Integer _price) {
		id = _id;
		name = _name;
		price = _price;
	}


	public SchoolStuff() {
		id = 0;
		name = "";
		price = 0;
	}
	
	public String getName() {
		return name;
	}


	public Integer getPrice() {
		return price;
	}


	public abstract void doAction();
	public abstract void show();
	
}
