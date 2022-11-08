package com.learn.oop;

public class HR extends Employee {
	Integer bonus=15000;
	Integer total=bonus+baseSalary;
	public static void main(String[] args) {
		HR h11=new HR();
		System.out.println("Total salary:"+h11.total);
	}

}