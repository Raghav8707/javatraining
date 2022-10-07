package com.infinitee.day2;

public class Emparray {
	public static void main(String[] args) {
		Emp[] arr = new Emp[]{
			new Emp(1,"Raghav",654321),
			new Emp(2,"sahin",654321),
			new Emp(3,"kk",8754)
		};
		for (Emp emp : arr) {
			System.out.println(emp);
		}
	}

}
