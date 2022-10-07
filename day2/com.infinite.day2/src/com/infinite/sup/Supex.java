package com.infinite.sup;
class First
{public void show()
	{
	System.out.println("show method from class 1");
	}
	}
class Second extends First
{public void show()
	{super.show();
	System.out.println("show method from class 2");
	}
	}
public class Supex {
	public static void main(String[] args) {
		
	
	Second obj = new Second();
	obj.show();
	}
}
