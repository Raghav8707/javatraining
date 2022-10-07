package com.infinitee.day2;

public class Overloadingex2 {
	public int sum()
	{
		return 5;	
	}
	public int sum(int x)
	{
		return x+5;	
	}
	public int sum(int x,int y)
	{
		return x+y;	
	}
	public static void main(String[] args) {
		Overloadingex2 obj = new Overloadingex2();
		System.out.println("1 arg "+obj.sum());
		System.out.println("2 arg "+obj.sum(45));
		System.out.println("3 args "+obj.sum(4,5));
	}
	
}
