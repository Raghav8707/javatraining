package com.infinitee.day2;

import javax.swing.InputVerifier;
import javax.swing.JComponent;

public class Overloadex1 {
	public void show(int x) {
		System.out.println("Show method wrt int " +x);
		
		
	}
	public void show(double x) {
		System.out.println("Show method wrtt double " +x);
		
		
	}
	public void show(String x) {
		System.out.println("Show method wrt string " +x);
		
		
	}
	public static void main(String[] args) {
		Overloadex1 obj = new Overloadex1();
		obj.show(12);
		obj.show(12.5);
		obj.show("Welcome");
	}
}
