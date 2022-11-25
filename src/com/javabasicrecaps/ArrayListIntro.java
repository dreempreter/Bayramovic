package com.javabasicrecaps;

import java.util.ArrayList;

public class ArrayListIntro {
public static void main(String[] args) {
	
	int[] numbers = new int[4]; //you have to specify the size, you can not change the size
	//it is very limited
	
	ArrayList<String> names = new ArrayList<String>();
	int size = names.size();
	System.out.println("size:" + size);
	
	names.add(" Baris ");
	names.add(" Enes ");
	names.add(" Murad ");
	
	System.out.println("size:" + names.size());
	
	names.add("Aykut");
	
	System.out.println(names);
	
	System.out.println("-----Iterating the ArrayList with for loop");
	
	for(int i=0; i<names.size(); i++)
	{
		String name = names.get(i);
		System.out.print(name);
	}
	System.out.println("---------------");
	for(String element :names)
	{
		System.out.print(element);
	}
}
}
