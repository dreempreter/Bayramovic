package com.javabasicrecaps;

import java.util.ArrayList;

public class Pratik {
public static void main(String[] args) {
	
	ArrayList<String>names = new ArrayList();
	
	names.add("Murik");
	names.add("Crystal");
	names.add("Cassidy");
	names.add("Lillian");
	names.add("Emberlyn");
	
	//Is ArrayList empty?
	System.out.println("Is arrayList empty? " + names.isEmpty());
	System.out.println("Is arrayList contains Murik? " + names.contains("Murik"));
	System.out.println("The size of ArrayList is " + names.size());
	
	for( String element:names)
	{
		System.out.println(element);
	}
	
	
}
}
