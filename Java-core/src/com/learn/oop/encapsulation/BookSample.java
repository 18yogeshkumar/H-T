package com.learn.oop.encapsulation;

public class BookSample {
	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.setCopiesSold(190000);
		b1.setName("Catcher in the rye");
		b1.setPublishDate("10-11-1998");
		b1.setPublisher("Penguin");
		b1.setWriter("J.D Salinger");
		
		System.out.println("Book name:"+ b1.name);
	}
}
