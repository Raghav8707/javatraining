package com.infinitee.day2;

public class StudentArray {
	public static void main(String[] args) {
		
	Student[] s1=new Student[]{
			new Student(1,"yy","iuhh",8),
			new Student(2,"kkk","ijgjgb",10)
	};for (Student student : s1) {
		System.out.println(student);
	} 
	}

}
