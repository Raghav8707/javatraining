package com.infinite.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		SortedSet<Employee> employList = new TreeSet<Employee>();
		employList.add(new Employee(1,"Raggah",85564));
		employList.add(new Employee(2,"Sachin",454645));
		employList.add(new Employee(3,"kk",463));
		employList.add(new Employee(4,"ss",6846));
	}

}
