package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String>  a1=new ArrayList<>();
		a1.add("Maths");
		a1.add("Science");
		a1.add("Bio");
		a1.add("Chemistry");
		a1.add("Physics");
		
		System.out.println("Using for-each loop to iterate");
		for(String test:a1)
		{
			System.out.println(test);
		}
		
		System.out.println("Using Iterator to iterate");
		
		Iterator itr1= a1.iterator();
		while(itr1.hasNext())
			{
			System.out.println(itr1.next());
			}
	}
	

}
