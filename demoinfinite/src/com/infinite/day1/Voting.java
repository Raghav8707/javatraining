package com.infinite.day1;

public class Voting {
	public void check(int age) {
		if (age>=18) {
			System.out.println("You are Eligible for voting");
			
		} else {
			System.out.println("You are not eligible for voting");

		}
		
	}
	public static void main(String[] args) {
		int age=17;
		Voting obj = new Voting();
		obj.check(age);
	}
}
