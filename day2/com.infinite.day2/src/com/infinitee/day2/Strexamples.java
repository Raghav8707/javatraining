package com.infinitee.day2;

public class Strexamples {
	public void show()
	{String string="Welcom to java programming";
	System.out.println("Length of string "+string.length());//Length
	System.out.println("First occurence of char o "+string.indexOf('o'));//indexof
	System.out.println("char at position 5 is "+string.charAt(5));//charat
	System.out.println("lower case "+ string.toLowerCase());//lower case
	System.out.println("Upper case "+string.toUpperCase());//upper case
	String string1 = "Yeshwanth",string2="Raghav",string3 ="Raghav";
	System.out.println(string2.equals(string3));
	System.out.println(string1.equals(string3));
	}
	public static void main(String[] args) {
		Strexamples obj = new Strexamples();
		obj.show();
	}
}
