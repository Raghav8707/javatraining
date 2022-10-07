package com.infinite.collection;

import java.util.Scanner;

public class Scan2 {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter 2 nos");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println("Sum of a and b is "+c);
	}

}
