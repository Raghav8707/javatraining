package com.infinite.intf;

import javax.sound.midi.VoiceStatus;

interface ITraining{
	void name();
	void email();
}
class Kishore implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Kishore");
		
	}

	@Override
	public void email() {
		System.out.println("Kishore@nnnn.com");
		
	}
	
}
class Vardhil implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is vardhil");
		
	}

	@Override
	public void email() {
		System.out.println("email is Vardhil@king.com");
		
	}
	
}
public class Intfdemo {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[]{
				new Vardhil(),new Kishore()
		};
		for (ITraining t : arr) {
			t.name();
			t.email();
			
		}
		
	}
	

}
