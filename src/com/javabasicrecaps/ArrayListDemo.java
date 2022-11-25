package com.javabasicrecaps;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<Integer> numbers =new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(15);

	System.out.println(numbers.get(2));
	System.out.println(numbers.size());
	
	System.out.println("Does contain 15? " + numbers.contains(15));
	System.out.println("Does contain 25? " + numbers.contains(25));
	
	System.out.println(numbers);
	
	System.out.println("----iterating with for loop---");
	
	for(int i=0; i<numbers.size(); i++)
	{
		System.out.println(numbers.get(i));
		
	}
	

	System.out.println("----iterating with for loop---");
	
	for(int elements: numbers)
	{
		System.out.println(elements);
	}
	
	
}
}
