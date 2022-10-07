package com.infinite.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Genlistex2 {
	public static void main(String[] args) {
		Comparator<Employee> c = new NameComparatorr();
		List<Employee> employList=new ArrayList<Employee>();
		employList.add(new Employee(1,"Raggah",85564));
		employList.add(new Employee(2,"Sachin",454645));
		employList.add(new Employee(3,"kk",463));
		employList.add(new Employee(4,"ss",6846));
		for (Employee e : employList) {
			System.out.println(e);
			
		}
	}

}
