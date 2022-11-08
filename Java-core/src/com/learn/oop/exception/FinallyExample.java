package com.learn.oop.exception;

public class FinallyExample {

	public static void main(String[] args) {
		
		try {
			
			Integer resultant =100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
			finally
			{
				System.out.println("Finally block will execute everytime");
			}
		}
	}

