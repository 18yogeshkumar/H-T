package com.learn.oop;

public class Sales extends Employee {
	Integer bonus=15000;
	Integer incentive;
	
	//method overriding
	void working()
	{
		System.out.println("Inside Sales class");
	}
	public static void main(String[] args) {
		Sales s1=new Sales();
		s1.incentive=25000;
		s1.totalSalary(s1.baseSalary, s1.bonus,s1.incentive);
		s1.working();
	}

}
