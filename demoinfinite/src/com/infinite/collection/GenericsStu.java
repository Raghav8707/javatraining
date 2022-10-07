package com.infinite.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericsStu {
	Comparator<Student> c = new NameComparatorr2();
	List<Student> studList=new ArrayList<Student>();
	studList.add(new Student(1,"Raggah",85564));
	studList.add(new Student(2,"Sachin",454645));
	studList.add(new Student(3,"kk",463));
	studList.add(new Student(4,"ss",6846));
	for (Student e : studList) {
		System.out.println(e);

}
