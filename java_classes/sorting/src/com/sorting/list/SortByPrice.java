package com.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<TestE> {

	@Override
	public int compare(TestE o1, TestE o2) {
		if(o1.price > o2.price) {
			return 1;
		}else if(o1.price < o2.price) {
			return -1;
		}else {
		
		return 0;
		}
	}

}
