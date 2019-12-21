package com.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	//	public int compareTo(Student o) {
	//		
	//		if(this.id > o.id) {
	//			return 1;
	//		}else if(this.id < o.id) {
	//			return -1;
	//		}else {
	//		
	//		
	//		return 0;
	//		}
	//	}
	@Override
	public int compareTo(Student s) {

		String p = this.name;
		String q = s.name;
		String r =	p.toUpperCase();
		String e = q.toUpperCase();


		return r.compareTo(e);		
	}





}
