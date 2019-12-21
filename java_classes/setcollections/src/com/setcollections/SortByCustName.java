package com.setcollections;

import java.util.Comparator;

public class SortByCustName implements Comparator<Custmore> {

	@Override
	public int compare(Custmore o1, Custmore o2) {
		
		String s1 = o1.name;
		String s2 = o2.name;
		
		return s1.compareTo(s2);
	}

}
