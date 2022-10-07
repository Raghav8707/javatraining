package com.infinite.collection;

public class Customer {
	int custid;
	String name;
	String city;
	double premium;
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", city=" + city + ", premium=" + premium + "]";
	}
	public Customer(int custid, String name, String city, double premium) {
		
		this.custid = custid;
		this.name = name;
		this.city = city;
		this.premium = premium;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
