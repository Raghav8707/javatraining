package com.infinite.intf;

interface IOne{
	void name();
}
interface ITwo{
	void email();
}
class Madhu implements IOne,ITwo{


@Override
public void email() {
	System.out.println("Email is Madhu@gmail.com");
	
}

@Override
public void name() {
	System.out.println("Name is Madhu");
	
}}
public class Multinf {
	public static void main(String[] args) {
		
		Madhu obj = new Madhu();
		obj.name();
		obj.email();
	}

}