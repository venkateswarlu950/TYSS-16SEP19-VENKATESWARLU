package com.mapinterface.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee(112, "suresh", 150000);
		Employee e2 = new Employee(113, "ramesh", 180000);
		Employee e3 = new Employee(114, "raja", 120000);
		Employee e4 = new Employee(115, "sekar", 170000);
		Employee e5 = new Employee(116, "praveen", 140000);

		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e1);
		al1.add(e2);
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e3);
		al2.add(e4);
		al2.add(e5);

		HashMap<String, ArrayList<Employee>> mp = new HashMap<String, ArrayList<Employee>>();

		mp.put("raja", al1);
		mp.put("sekar", al2);

		ArrayList<Employee> e = mp.get("sekar");
		System.out.println("=========using itetraor===========");
		Iterator<Employee> i = e.iterator();
		while(i.hasNext()) {
			Employee em = i.next();

			System.out.println(em.empId);
			System.out.println(em.empName);
			System.out.println(em.salary);
			System.out.println("=================");
		}


	}

}
