package com.learn.oop.abstraction;

public class ITBusiness implements Business {

	@Override
	public void revenue() {
		System.out.println("Rapid revenue growth for FY 2022");
		
	}
	public static void main(String[] args) {
		ITBusiness b1=new ITBusiness();
		b1.revenue();
	}

}
