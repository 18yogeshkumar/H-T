package com.learn.oop;

public class Employee{
	Integer baseSalary=40000;
	void totalSalary(Integer base,Integer bonus)
	{
		Integer total=base+bonus;
		System.out.println("Empployee's total salary:"+total);
	}
	
	void totalSalary(Integer base,Integer bonus, Integer incentive )
	{
		Integer total=base+bonus+incentive;
		System.out.println("Employee's total salary:"+total);
	}
	void working()
	{
		System.out.println(" Inside Employee class");
	}
}

