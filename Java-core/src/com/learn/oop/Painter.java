package com.learn.oop;

public class Painter extends Employee {
	Integer bonus=35000;
	Integer total=bonus+baseSalary;
	public static void main(String[] args) {
		Painter p1=new Painter();
		System.out.println("Total salary:"+p1.total);
	}

}
