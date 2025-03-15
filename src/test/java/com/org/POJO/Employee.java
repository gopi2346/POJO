package com.org.POJO;

public class Employee {
	
	public static void main(String[] args) {
		
		practicePojo obj = new practicePojo();
		obj.setAccuracy("50");
		obj.setName("Gopi");
		obj.setPhone_number("12345");
		obj.setAddress("123, Tamil Nadu, India");
		
		practicePojo obj1 = new practicePojo();
		System.out.println(obj1.getAccuracy());
		System.out.println(obj1.getName());
		System.out.println(obj1.getPhone_number());
		System.out.println(obj1.getAddress());
	
		
	}
}
