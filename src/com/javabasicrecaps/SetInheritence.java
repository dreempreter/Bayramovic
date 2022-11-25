package com.javabasicrecaps;

import java.util.HashSet;
import java.util.Iterator;

public class SetInheritence {
public static void main(String[] args) {
	
	HashSet<String>hset = new HashSet<String>();
	
	//adding elements to hashSet
	
	hset.add("Apple");
	hset.add("Mango");
	//Adding of duplicate elements
	hset.add("Apple");
	hset.add("Mango");
	//Addition of null values
	hset.add(null);
	hset.add(null);
	
	System.out.println(hset);
}

}

	
	



