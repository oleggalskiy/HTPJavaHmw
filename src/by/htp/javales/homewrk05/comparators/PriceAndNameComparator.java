package by.htp.javales.homewrk05.comparators;

import java.util.Comparator;

import by.htp.javales.homewrk05.lib.SchoolStuff;

public class PriceAndNameComparator implements Comparator<SchoolStuff> {

	@Override
	public int compare(SchoolStuff o1, SchoolStuff o2) {

		int result;
		result = Integer.compare(o1.getPrice(), o2.getPrice());
		if (result != 0) {
			return result;

		}
		result = o1.getName().compareTo(o2.getName());
		if (result != 0) {

		}

		return result;

	}

}
