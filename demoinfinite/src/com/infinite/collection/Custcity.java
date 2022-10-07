package com.infinite.collection;

import java.util.Comparator;

public class Custcity implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		
		return c1.city.compareTo(c2.city);
	}

}
