package com.infinite.abs;
abstract class Vehicle{
	abstract void name();
	abstract void type();
}
class PassionPro extends Vehicle
{

	@Override
	void name() {
		System.out.println("Name is passion pro");
		
	}

	@Override
	void type() {
		System.out.println("2 wheeler");
		
	}	
	
	}
class Scross extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Scross");
		
	}

	@Override
	void type() {
		System.out.println("4 wheeler");
		
	}
	
}

public class Abstest {
	public static void main(String[] args) {
		Vehicle[] arr=new Vehicle[]{
				new PassionPro(),
				new Scross()
				
		};
		
		for (Vehicle v : arr) {
			v.name();
			v.type();
		}		
	}
	

}
