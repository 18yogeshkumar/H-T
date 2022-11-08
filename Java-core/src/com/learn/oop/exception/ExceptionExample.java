package com.learn.oop.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		try {
			
			Integer resultant =100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
