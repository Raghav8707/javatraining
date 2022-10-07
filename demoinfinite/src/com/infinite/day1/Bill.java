package com.infinite.day1;

public class Bill {
	public void calc(int a)
	{double sum=0,d;
	double u,p;
			if(a<90)
			{
				sum=a;
			}
			else if(a>=90&&a<=150)
			{
				sum=90+(a-90)*1.5;
			}
			else	if(a>=151&&a<=200)
			{
				sum=90+60*1.5+(a-150)*2;
			}
			else if(a>=201&&a<=240)
			{
				sum=90+60*1.5+50*2+(a-200)*2.5;
			}
			else if(a>240)
			{
				
				sum=380+(a-240)*3;
				}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int a=241;
		Bill obj=new Bill();
		obj.calc(a);
	}

}
