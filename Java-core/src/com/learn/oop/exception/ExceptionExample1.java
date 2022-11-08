package com.learn.oop.exception;

import java.io.IOException;

class Jet
{
	void breaks() throws IOException
	{
		throw new IOException("the jet is broken");
	}
}

public class ExceptionExample1 {
	public static void main(String[] args) {
		
		
		try
		{
			Jet j1=new Jet();
			j1.breaks();
		}
		catch(Exception e)
		{
			System.out.println(" Exception handled"+e);
		}
		System.out.println("Code continues...");
		
	}

}
