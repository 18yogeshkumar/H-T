package com.learn.oop;

public class Student {
	Integer id;
	String name;
	Address address;
	
	void addStudent(Integer id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void displayStudent()
	{
		System.out.println("name:"+ name +" city:"+address.city+" state:"+address.state);
	}
	public static void main(String[] args) {
		Address a1=new Address("Pune","Maharastra","India");
		Student s1=new Student();
		s1.addStudent(123,"Sharon",a1);
		s1.displayStudent();
	}
}
