package by.htp.javales.homewrk05.lib;

import java.awt.Color;

public class ColoredPen extends Pen {

	public ColoredPen(Color _color) {
		name = "Цветная ручка";
		color = _color;
		price = 6;
	}

	public void write(Color _color) {

		System.out.println("make font._color: Kalaki- malaki");

	}

	public void show() {
		System.out.println();
		System.out.println("[ Наименование: " + name + " ]");
		System.out.println("[ Цвет: " + color + " ]");
		System.out.println("[ Цена: " + price + " ]");

	}
}
