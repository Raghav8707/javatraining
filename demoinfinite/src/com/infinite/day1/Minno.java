package com.infinite.day1;

public class Minno {
	public void min(int a,int b,int c)
	{
		int m=a;
		if (m>b) {
			m=b;
			
		}
		if (m>c) {
			m=c;
			
		}
		System.out.println(m+" is smallest no.");
	}
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=6;
		c=9;
		Minno obj=new Minno();
		obj.min(a, b, c);
	}
}
