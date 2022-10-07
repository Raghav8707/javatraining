package com.infinite.day1;

public class CaseExample {
	public void show(int n)
	{
		switch (n) {
		case 1:System.out.println("Hi i am sachin");
			
			break;
		case 2:System.out.println("Hi i am sireesha");
		
		break;
		case 3:System.out.println("Hi i am javed");
		
		break;
		case 4:System.out.println("Hi i am haripriya");
		
		break;
		case 5:System.out.println("Hi i am sahithi");
		
		break;

		default:
			System.out.println("invalid choice");
			break;
		}
	}
	public static void main(String[] args) {
		int n=4;
		CaseExample obj = new CaseExample();
		obj.show(n);
		
	}

}
