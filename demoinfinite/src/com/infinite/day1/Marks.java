package com.infinite.day1;

public class Marks {
	public void avgtot(int a,int b,int c,int d,int e)
	{
		if(a>35&&b>35&&c>35&&d>35&&e>35)
		{
			double sum=a+b+c+d+e;
			double avg=(a+b+c+d+e)/5;
		System.out.println("Sum is "+sum);
		System.out.println("avg is "+avg);
		}else {
			System.out.println("FAiled");
		}
	}
	public static void main(String[] args) {
		int a,b,c,d,e;
		a=78;
		b=87;
		c=85;
		d=45;
		e=78;
		Marks obj=new Marks();
		obj.avgtot(a, b, c, d, e);
	}

}
