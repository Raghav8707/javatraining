package com.infinite.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setdemo2 {
	public static void main(String[] args) {
		Set names = LinkedHashSet();
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
