package com.infinitee.day2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class BoxingExample2 {
	public void show(Object ob)
	{
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if(type.equals("Integer")){
			System.out.println("Integer CAsting");
			int x = (Integer)ob;
		}
		if(type.equals("Double")){
			System.out.println("double CAsting");
			double x =(Double)ob;
		}
		if(type.equals("String")){
			System.out.println("String CAsting");
			String x = (String)ob;
		}
	}
	public static void main(String[] args) {
		{
			int a=12;
			String string = "Hello";
			double bas = 84823.44;
			BoxingExample2 obj = new BoxingExample2();
			obj.show(a);
			obj.show(string);
			obj.show(bas);
		}
	}
}
