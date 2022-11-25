package com.javabasicrecaps;

import java.util.ArrayList;

public class HomeWork {
public static void main(String[] args) {
/*	
	Create a ArrayList that will store 5 names into it.
	Find out whether the given ArrayList is empty or not?
	Check whether the specific name is present in an ArrayList or not?
	Find the size of your ArrayList and print all values from the ArrayList*/
	
	
	ArrayList<String> names = new ArrayList<String>();
	
	System.out.println("Is list of names empty or not? " + names.size());
	names.add("Murad");
	names.add("Salih");
	names.add("Veysel");
	names.add("Ahmet");
	names.add("Enes");
	
	System.out.println("Is arrayNameList empty? " + names.isEmpty());
	System.out.println(" The size of given array " + names.size());
	System.out.println("Are the names in NameList Or not? " +names.containsAll(names));
	System.out.println(names);
	
	System.out.println("------------");
	
	for( String items:names)
	{
		System.out.println(names);
	}
	
	System.out.println("------------");
	
	
	for(int i =0; i<names.size(); i++)
	{
		System.out.println(names.get(i));
	}
	
	
	
	
	
}
}
