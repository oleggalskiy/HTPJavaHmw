package by.htp.javales.homewrk05.lib;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import by.htp.javales.homewrk05.comparators.NameComparator;
import by.htp.javales.homewrk05.comparators.PriceAndNameComparator;
import by.htp.javales.homewrk05.comparators.PriceComparator;

public class BeginnerSet {

	private List<SchoolStuff> beginnerSet = new ArrayList<SchoolStuff>();

	public BeginnerSet() {

		beginnerSet.add(new Copybook("в линейку", 12));
		beginnerSet.add(new Copybook("в клетку", 48));
		beginnerSet.add(new Textbook("Руззки йазыг. 5 класс"));
		beginnerSet.add(new Textbook("Математика"));
		List<WritingAccessories> forWritting = new ArrayList<WritingAccessories>();
		beginnerSet.add(new Pen());
		beginnerSet.add(new Pencil());
		beginnerSet.add(new ColoredPen(Color.RED));
		beginnerSet.add(new PencilEraser());
		beginnerSet.add(new ColoredPencil(Color.RED));
		beginnerSet.add(new ColoredPencil(Color.GREEN));
		beginnerSet.add(new ColoredPencil(Color.BLUE));
		beginnerSet.add(new SchoolBox(forWritting));

	}

	public void selectSort(int k) {

		if (k == 1) {
			beginnerSet.sort(new PriceComparator());
		}
		if (k == 2) {
			beginnerSet.sort(new NameComparator());
		}
		if (k == 3) {
			beginnerSet.sort(new PriceAndNameComparator());
			
		}
	}

	public void printSet() {
		for (SchoolStuff n : beginnerSet) {
			n.show();
		}
	}

	public List<SchoolStuff> getBeginnerSet() {
		return beginnerSet;
	}

}
