package com.infinite.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("gfds");
		names.add("gfdswed");
		names.add("dw");
		names.add("wfewe");
		names.add("wedef");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
		
	}

}
