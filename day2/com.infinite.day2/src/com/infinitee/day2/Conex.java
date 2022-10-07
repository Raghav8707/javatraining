package com.infinitee.day2;

public class Conex {
	static{
		System.out.println("Static Constructor");
	}
	Conex() {
		System.out.println("Instance Constructor");
	}
	public static void main(String[] args) {
		new Conex();
	}
}
