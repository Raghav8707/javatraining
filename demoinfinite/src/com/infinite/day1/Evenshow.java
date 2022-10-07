package com.infinite.day1;

public class Evenshow {
	public void show(int n){
		int i=0;
		while(i<n)
		{
			i=i+2;
			System.out.println("Even "+i);
			
		}
	}
		public static void main(String[] args) {
			int n=20;
			Evenshow obj = new Evenshow();
			obj.show(n);
		}
}
