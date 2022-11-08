package com.learn.oop.exception;

public class EligibilityExcpetion {
	
	public static void Eligibility(Integer age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else
		{
			System.out.println("Person is eligible to vote");
		}
	}
	public static void main(String[] args) {
		
		
			Eligibility(12);
			
			
		
	}

}
