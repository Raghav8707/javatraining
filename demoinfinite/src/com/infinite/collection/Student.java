package com.infinite.collection;

public class Student {
	int sno;
	String sname;
	String city;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", city=" + city + "]";
	}
	public Student(int sno, String sname, String city) {
		
		this.sno = sno;
		this.sname = sname;
		this.city = city;
	}
	

}
