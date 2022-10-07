package com.infinite.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDem2 {
	public static void main(String[] args) {
		List employList=new ArrayList();
		employList.add(new Employ(1,"Raggah",85564));
		employList.add(new Employ(2,"Sachin",454645));
		employList.add(new Employ(3,"kk",463));
		employList.add(new Employ(4,"ss",6846));
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
			
		}
				
	}

}
