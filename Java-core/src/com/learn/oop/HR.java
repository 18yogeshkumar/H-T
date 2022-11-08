package com.learn.oop;

public class HR extends Employee {
	Integer bonus=15000;
	Integer total=bonus+baseSalary;
	public static void main(String[] args) {
		HR h1=new HR();
		System.out.println("HR's Total salary:"+h1.total);
		h1.totalSalary(h1.baseSalary, h1.bonus);
	}

}