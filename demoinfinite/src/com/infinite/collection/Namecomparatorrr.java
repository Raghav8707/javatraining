package com.infinite.collection;

import java.util.Comparator;


public class NameComparatorrr implements Comparator<Student>

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.sname.compareTo(o2.sname);
		}

}
