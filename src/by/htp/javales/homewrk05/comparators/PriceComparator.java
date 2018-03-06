package by.htp.javales.homewrk05.comparators;

import java.util.Comparator;

import by.htp.javales.homewrk05.lib.SchoolStuff;

public class PriceComparator implements Comparator<SchoolStuff> {

	@Override
	public int compare(SchoolStuff arg0, SchoolStuff arg1) {
		int result;
		result = Integer.compare(arg0.getPrice(), arg1.getPrice());
		if (result != 0) {
			return -result;

		}

		return result;
	}

}
