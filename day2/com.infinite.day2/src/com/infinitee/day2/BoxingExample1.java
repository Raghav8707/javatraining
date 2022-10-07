package com.infinitee.day2;

public class BoxingExample1 {
	public static void main(String[] args) {
		int a=12;
		String str = "Hello";
		double sal = 5243.2;
		//implement boxing
		Object ob1 = a;
		Object ob2 = str;
		Object ob3 = sal;
		//unboxing
		int a1=(Integer)ob1;
		String s1=(String)ob2;
		double b1 = (double)ob3;
		System.out.println(a1);
		System.out.println(s1);
		System.out.println(b1);
	}

}
