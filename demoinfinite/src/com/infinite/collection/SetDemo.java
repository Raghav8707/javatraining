package com.infinite.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("ew");
		names.add("sda");
		names.add("dsa");
		names.add("dsae");
		names.add("rf34dd34");
		names.add("r4r4r4d");
		names.add("r4rf4rf4rr4f");
		names.add("ew");
		names.add("sda");
		names.add("dsa");
		names.add("dsae");
		names.add("rf34dd34");
		names.add("r4r4r4d");
		names.add("r4rf4rf4rr4f");
		for (Object ob : names) {
			System.out.println(ob);
			
		}
	}

}
