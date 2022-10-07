package com.infinite.abs;
abstract class Training{
	abstract void name();
	abstract void email();
}
class Sindhu extends Training{

	@Override
	void name() {
		System.out.println("Name is sindhu");
		
	}

	@Override
	void email() {
		System.out.println("Email is sindhu@gmail.com");
		
	}
	
}
class Javed extends Training{

	@Override
	void name() {
		System.out.println("Name is javed");
		
	}

	@Override
	void email() {
		System.out.println("Email is javed@gmail.com");
		
	}
	
}
class Yeshwanth extends Training{

	@Override
	void name() {
		System.out.println("Name is Yeshwanth");
		
	}

	@Override
	void email() {
		System.out.println("Email is Yeshwanth@gmail.com");
		
	}
	
}
public class Absdemo {
	public static void main(String[] args) {
//		Training obj1=new Yeshwanth();
//		Training obj2=new Javed();
//		Training obj3=new Sindhu();
		Training[] arr = new Training[]{
				new Yeshwanth(),
				new Sindhu(),
				new Javed()
		};
		for (Training t : arr) {
			t.name();
			t.email();
			
		}
	}
	

}
