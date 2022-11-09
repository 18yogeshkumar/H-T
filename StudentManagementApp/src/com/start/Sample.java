package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
	public static void main(String[] args) throws IOException {
		System.out.println("Test class");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		while(true){
	        System.out.println("1 to add student");
	        System.out.println("2 to delete student");
	        System.out.println("3 to display student");
	        System.out.println("4 to exit");
	        int choice=Integer.parseInt(b.readLine());
	        
	        if(choice==1)
	        {
	        	
	        }
	        if(choice==2)
	        {
	        	
	        }
	        if(choice==3)
	        {
	        	
	        }
	        if(choice==4)
	        {
	        	
	        }
		}
	}

}
