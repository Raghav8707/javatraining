package com.infinite.day1;

public class CtoR {
	public void convert(double c)
	{
		double r = (4*c)/5;
		System.out.println("Centigrade to radian is "+ r);
	}
	public static void main(String[] args) {
		double c=78;
		CtoR obj = new CtoR();
		obj.convert(c);
		
	}
}
