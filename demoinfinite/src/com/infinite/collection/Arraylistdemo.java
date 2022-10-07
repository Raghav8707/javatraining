package com.infinite.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Raghav");
		names.add("sachin");
		names.add("javes");
		names.add("kk");
		System.out.println("names are");
		for (Object y : names) {
			System.out.println(y);
		}
	}

}
