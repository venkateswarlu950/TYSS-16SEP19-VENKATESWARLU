package com.setcollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestI {
	public static void main(String[] args) {
		
		LinkedHashSet<Custmore> lc = new LinkedHashSet<Custmore>();
		
		
		Custmore c1 = new Custmore("billa", 478, 547895);
		Custmore c2 = new Custmore("ibm", 789, 745892);
		Custmore c3 = new Custmore("infosys", 562, 214578);
		Custmore c4 = new Custmore("cap gemini", 124, 658479);
		Custmore c5 = new Custmore("cap gemini", 124, 658479);
		
		lc.add(c1);
		lc.add(c2);

		lc.add(c3);

		lc.add(c4);

		lc.add(c5);
		
		Iterator<Custmore> i = lc.iterator();
		System.out.println("=========uing iterator======");
		while (i.hasNext()) {
			Custmore c = i.next();
			System.out.println(c.id);
			System.out.println(c.name);System.out.println(c.salary);
			System.out.println("==========================");
		}


		
	}

}
