package com.learn.oop.collection.task;

import java.util.ArrayList;
import java.util.List;

class Employee {  

	String name;
	String salary;
	String experince;
	public Employee(String name, String salary, String experince) {
		super();
		this.name = name;
		this.salary = salary;
		this.experince = experince;
	}
	
}  
public class ArrayListTask {  
public static void main(String[] args) {       
    List<Employee> list=new ArrayList<Employee>();  
    Employee b1=new Employee("Rajnish","560000","2 years"); 
    list.add(b1);   
    for(Employee b:list){  
        System.out.println(b.name+" "+b.salary+" "+b.experince+" ");  
    }  
}  
}  