package by.htp.javales.homewrk05.comparators;

import java.util.Comparator;

import by.htp.javales.homewrk05.lib.SchoolStuff;

public class NameComparator implements Comparator<SchoolStuff> {

	@Override
	public int compare(SchoolStuff arg0, SchoolStuff arg1) {
		int result;
			result = arg0.getName().compareTo(arg1.getName());
			if(result!=0 ) {
				
			}
		
		return result;
	}
}
