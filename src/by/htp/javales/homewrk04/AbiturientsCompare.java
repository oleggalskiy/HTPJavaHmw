package by.htp.javales.homewrk04;

import java.util.Comparator;

public class AbiturientsCompare implements Comparator<Abiturient> {

	@Override
	public int compare(Abiturient arg0, Abiturient arg1) {
		int result;

		result = Double.compare(arg0.getMidRating(), arg1.getMidRating()); // сортируем по аргументу midRating
		if (result != 0) {
			return -result;
		}

		result = arg0.getSurName().compareTo(arg1.getSurName()); // при совпадении midRating сортируем по surName
		if (result != 0) {
			return result;
		}
		
		result = arg0.getName().compareTo(arg1.getName()); // при совпадении surName сортируем по name
		if (result != 0) {
			return result;
		}

		return result;

	}
}
