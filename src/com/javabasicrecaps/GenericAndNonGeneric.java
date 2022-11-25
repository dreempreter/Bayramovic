package com.javabasicrecaps;

import java.util.ArrayList;

public class GenericAndNonGeneric {
	public static void main(String[] args) {
		
	

	//Generic
	
	ArrayList<Double> d = new ArrayList();
	
	d.add(2.5);
	d.add(1.0);
	d.add(13.2);
	d.add(9.1);
	
	System.out.println(d);
	d.remove(0);
	System.out.println(d);
	
	//hot to get an element from index
	
	System.out.println(d.get(2));
	
	//for loop
	
	for(int a =0; a<d.size(); a++)
	{
		System.out.print(d.get(a) + " ");
		
	}
	System.out.println("-----------");
	
	for(double items : d)
	{
		System.out.print(items + " ");
	}
	
	System.out.println("----------");
	//Non-Generic
	
	ArrayList a1 = new ArrayList();
	
	a1.add(2.5);
	a1.add("Murad");
	a1.add(100);
	a1.add('B');
	
	System.out.print(a1 + " ");
	System.out.println("-----------");
	a1.remove(3);
	System.out.println(a1+ " ");
	
	
	System.out.println(a1.contains(100));
	
	System.out.println("--------");
	for(int b=0; b<a1.size(); b++)
	{
		System.out.print(a1.get(b));
	}
	
	System.out.println("------------");
	
	for(Object list:a1)
	{
		System.out.print(list);
	}
	
	
	
	
	
	
	
}
}