package com.infinite.day1;

public class Max3 {
	public void max(int a,int b,int c) {
//		if (a>b&&a>c) {
//			System.out.println(a+" is biggest no.");			
//			
//		}
//		else if (b>a&&b>c) {
//			System.out.println(b+" is biggest no.");
//			
//		}
//		else {
//			System.out.println(c+" is biggest no.");
//		}
//		
		int m=a;
		if(m<b)
		{
			m=b;
		}
		if(m<c)
		{
			m=c;
		}
		System.out.println(m+" is biggest no.");
	}
	public static void main(String[] args) {
		int a,b,c;
		a=3;
		b=7;
		c=5;
		Max3 obj = new Max3();
		obj.max(a, b, c);
	}

}
