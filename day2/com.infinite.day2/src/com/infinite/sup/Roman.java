package com.infinite.sup;

public class Roman {
	public static void main(String[] args) {
		int a=4545;
		String string=new String();
		int r1=a%10;
		a=a/10;
		int r2=a%10;
		a=a/10;
		int r3=a%10;
		a=a/10;
		int r4=a%10;
		
			if (r4>0&&r4<=4) {
					for (int i=1;i<=4;i++) {
					System.out.print("M");	
				}}
			else if (r4==5) {
				System.out.print("v");
				
			}	
			else if (r4>5&&r4<=8) {System.out.print("v");
				for (int i=1;i<=r4-5;i++) {
				System.out.print("M");	
			}}
				
				else if (r4==9) {
					System.out.print("ix");
					
				}
//////////////////////////////////////////////////////////////////////		//////////	//////////////////////////////////////////////////////////////////////////
			if (r3>0&&r3<=3) {
				for (int i=1;i<=3;i++) {
				System.out.print("C");	
			}}
			else if (r3==4) {
				System.out.print("CD");
				
			}
		else if (r3==5) {
			System.out.print("D");
			
		}	
		else if (r3>5&&r3<=8) {System.out.print("D");
			for (int i=1;i<=r3-5;i++) {
			System.out.print("C");	
		}}
			
			else if (r3==9) {
				System.out.print("CD");
				
			}
////////////////////////////////////////
			if (r2>0&&r2<=3) {
				for (int i=1;i<=3;i++) {
				System.out.print("X");	
			}}
			else if (r2==4) {
				System.out.print("XL");
				
			}
		else if (r2==5) {
			System.out.print("L");
			
		}	
		else if (r2>5&&r2<=8) {System.out.print("L");
			for (int i=1;i<=r2-5;i++) {
			System.out.print("X");	
		}}
			
			else if (r2==9) {
				System.out.print("XL");
				
			}
///////////////////////////////////////////////////////////////////////////////	
			if (r1>0&&r1<=3) {
				for (int i=1;i<=3;i++) {
				System.out.print("I");	
			}}
			else if (r1==4) {
				System.out.print("IV");
				
			}
		else if (r1==5) {
			System.out.print("V");
			
		}	
		else if (r1>5&&r1<=8) {System.out.print("V");
			for (int i=1;i<=r2-5;i++) {
			System.out.print("I");	
		}}
			
			else if (r1==9) {
				System.out.print("IX");
				
			}
		}
	}


