package com.learn.oop;

public class TV {
	
	String brand;
	String modelName;
	Integer screenSize;
	Integer price;
	String color;
	String DisplayType;
	
	void insertData(String brand, String modelName, Integer screenSize, Integer price, String color, String DisplayType)
	{
		this.brand=brand;
		this.color=color;
		this.DisplayType=DisplayType;
		this.modelName=modelName;
		this.price=price;
		this.screenSize=screenSize;
	}
	public static void main(String[] args) {
		
		TV object1= new TV();
		TV object2= new TV();
		
		object1.brand="Samsung";
		object1.color="Blue";
		object1.DisplayType="LED";
		object1.modelName="4k TV";
		object1.price=45000;
		object1.screenSize=55;
		
		object2.insertData("MI", " MI Smart TV", 40, 55000, "Black", "LED");
		
		System.out.println("First Object"+object1);
		System.out.println("Second Object"+object2);
	}
	@Override
	public String toString() {
		return "TV [brand=" + brand + ", modelName=" + modelName + ", screenSize=" + screenSize + ", price=" + price
				+ ", color=" + color + ", DisplayType=" + DisplayType + "]";
	}

}
