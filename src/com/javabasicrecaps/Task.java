package com.javabasicrecaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {
public static void main(String[] args) {
	
	List<String>aList= new ArrayList<>();
	
	aList.add("Murad");
	aList.add("Ugur");
	aList.add("Sabah");
	aList.add("Ellion");
	aList.add("Murad");
	aList.add("Ellion");
	
	System.out.println(aList);
	
	aList.remove("Murad");
	aList.remove("Ellion");
	System.out.println(aList + " ");
	
	System.out.println("-------------");
	
	
	HashSet<String> a = new HashSet<>(aList);
	System.out.println(a);
	
	
	
	
	
	
	
}
}
