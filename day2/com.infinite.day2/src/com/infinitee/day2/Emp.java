package com.infinitee.day2;

public class Emp {
	int empno;
	String name;
	double basic;
	
	public Emp() {
		
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String name, double basic) {
		
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	
	
}
