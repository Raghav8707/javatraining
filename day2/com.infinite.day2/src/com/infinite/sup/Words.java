package com.infinite.sup;

public class Words {
	public static void main(String[] args) {
		String num="4567";
		int len = num.length();
		System.out.println(len);
		if(len==4){
			System.out.println(num.charAt(0)+"Thousand" + num.charAt(1)+"Hundred"+num.charAt(2)+num.charAt(0));
		}
	}

}
