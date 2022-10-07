package com.infinite.day1;

public class Oddno {
	public void show(int n)
	{
		int i=1;
		while(i<n){
			
			System.out.println("odd "+i);
			i=i+2;
			
		}
	}
	public static void main(String[] args) {
		int n=20;
		Oddno obj = new Oddno();
		obj.show(n);
	}
}
