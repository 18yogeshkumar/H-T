package com.learn.oop.collection;

import java.util.*;  
public class LinkedListDemo{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Badminton");  
  al.add("Football");  
  al.add("Rugby");  
  al.add("Running");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  