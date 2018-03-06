package by.htp.javales.homewrk05.lib;

import java.awt.Color;

public class Pen extends WritingAccessories {
	
	
	protected Color color = Color.blue; 
	@SuppressWarnings("unused")
	private String font = "Like a chicken";
	
	
	public Pen() {
		name = "Шариковая ручка";
		price = 5; 
		
	}

	public void write() {
		System.out.println("make font.blue: Kalaki- malaki");
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Цвет: " + color + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}

}
