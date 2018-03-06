package by.htp.javales.homewrk05.lib;

import java.awt.Color;

public class ColoredPencil extends Pencil {

	private Color color;

	public ColoredPencil(Color _color) {
		super();
		name = "Цветной карандаш";
		price = 4;
		color = _color;

	}

	public void write(Color _color) {
		System.out.println("make font.color: Kalaki- malaki");

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
