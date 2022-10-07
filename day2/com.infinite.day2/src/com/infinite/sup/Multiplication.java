package com.infinite.sup;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import com.infinitee.day2.StaticExample;

public class Multiplication {
	public static void main(String[] args) {int c=0,x,r;
	String string=new String();
		String num = "7894561233214544445645455544";
		String num2 = "7778446454454746446654564455";
		int l=num.length();
		int j=num2.length();
		String[] numArray = null;  
		String[] num2Array = null;  
		numArray = num.split(" ");
		num2Array = num2.split(" ");
		for(int i=l;i<=1;i++)
		{
			for(int k=j;k<=1;k++)
			{	
				x=Integer.parseInt(numArray[i])*Integer.parseInt(num2Array[i]);
				r=x%10;
				string=Integer.toString(r+c);
				c=x/10;
				
				
			}
		}
		
	}
}
