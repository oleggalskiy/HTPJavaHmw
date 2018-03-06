package by.htp.javales.homewrk05.lib;

import java.awt.Color;

public class Pencil extends WritingAccessories{
	
	private final Color COLOR = Color.black;

	
	public Pencil() {
		super();
		name ="Простой карандаш";
		price = 3;
		
	} 
	
	public void write() {
		System.out.println("make font.black: Kalaki- malaki");
		
	}

	public Color getCOLOR() {
		return COLOR;
	}
	
	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Цвет: " + COLOR + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}
}
