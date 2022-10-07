package com.infinite.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedEmploy {
	public static void main(String[] args) {
//		Comparator c= new NameComparator();
		Comparator b = new BasicComparator();
		SortedSet employList = new TreeSet(b);
		employList.add(new Employ(1,"Raggah",85564));
		employList.add(new Employ(2,"Sachin",454645));
		employList.add(new Employ(3,"kk",463));
		employList.add(new Employ(4,"ss",6846));
		for (Object obj : employList) {
			Employ employ = (Employ)obj;
			System.out.println(obj);
		}
	}

}
