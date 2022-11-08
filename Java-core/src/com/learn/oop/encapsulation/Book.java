package com.learn.oop.encapsulation;

public class Book {
	String name;
	String writer;
	String publishDate;
	String publisher;
	Integer copiesSold;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getCopiesSold() {
		return copiesSold;
	}
	public void setCopiesSold(Integer copiesSold) {
		this.copiesSold = copiesSold;
	}
	

}
