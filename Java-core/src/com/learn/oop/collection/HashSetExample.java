package com.learn.oop.collection;
import java.util.*;  
public class HashSetExample { 
 public static void main(String args[]){  
   
  HashSet<String> set=new HashSet<String>();  
  set.add("Ice");  
  set.add("Mountain");  
  set.add("Beach");  
  set.add("Mountain");  
   
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 