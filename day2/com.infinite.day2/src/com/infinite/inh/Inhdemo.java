package com.infinite.inh;
class First{
	public void show() {
		System.out.println("Show method from class first");
		
	}
}

class Second extends First{
	public void display()
	{
		System.out.println("Display method from second class");
	}
}
public class Inhdemo {
	public static void main(String[] args) {
		
	
	Second obj = new Second();
	obj.show();
	obj.display();
	}
}
