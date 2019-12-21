package com.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(13);
		al.add(46);
		al.add(87);
		al.add(39);

		List<Integer> li =	al.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println("==================");

		for (Integer i : li) {
			System.out.println(i);
		}
		
		List<Integer> ll = al.stream().map(i -> i*i).collect(Collectors.toList());

		System.out.println("========================");
		for (Integer i : ll) {
			System.out.println(i);
		}

		List<Integer> l2 = al.stream().map(i -> i + 50).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("==================");
		
		Comparator<Integer> comp = (m1 , m2) -> {
			if(m1 > m2) {
				return 1;
			}else if (m1 < m2) {
				return -1;
			}else {
				return 0;
			}
		};
		long res = al.stream().filter(i -> i < 40).count();
		System.out.println(res);
		
		System.out.println("=======min value=======");
		Integer t = al.stream().min(comp).get();
		System.out.println(t);
		
		
		List<Integer> g = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("========sorted ================");
		Iterator<Integer> r = g.iterator();
		
		while(r.hasNext()) {
		Integer n =	r.next();
		
		System.out.println(n);
		System.out.println("=====================");
		}
		


	}

}
