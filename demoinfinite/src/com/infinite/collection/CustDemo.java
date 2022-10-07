package com.infinite.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CustDemo {
	public static void main(String[] args) {
//		List custlist = new ArrayList();
		Comparator ct = new Custcity();
		SortedSet custlist = new TreeSet(ct);
		custlist.add(new Customer(1,"ded","ww",2323));
		custlist.add(new Customer(2,"ew","ws",322));
		custlist.add(new Customer(3,"ws","swsw",2323));
		custlist.add(new Customer(4,"sw","swsw",232));
		for (Object ob : custlist) {
			Customer cust=(Customer)ob;
			System.out.println(ob);
			
		}
	}
}
