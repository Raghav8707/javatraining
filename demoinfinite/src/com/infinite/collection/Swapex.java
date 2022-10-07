package com.infinite.collection;



class Data<T>{
	public void swap(T a,T b){
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value is "+a+" B value is "+b);
	}
}
public class Swapex {
	public static void main(String[] args) {
		Data obj = new Data();
		int a=5,b=3;
		obj.swap(a, b);
		String s1="Bhargavi",s2="madhu";
		obj.swap(s1, s2);
	}

}
