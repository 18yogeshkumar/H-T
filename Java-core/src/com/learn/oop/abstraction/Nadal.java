package com.learn.oop.abstraction;

public class Nadal extends Tennis {
	
	void play()
	{
		System.out.println("Nadal is ruling in Thomas Cup 2022");
	}
	public static void main(String[] args) {
		Nadal n1=new Nadal();
		n1.play();
	}

}
