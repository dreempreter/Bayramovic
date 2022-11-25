package com.javabasicrecaps;

import java.util.HashSet;
import java.util.Iterator;

public class Hashh {
public static void main(String[] args) {
	
	
	HashSet<String> hset = new HashSet<>();
	hset.add("Azerbaijan");
	hset.add("Denmark");
	hset.add("Estonia");
	hset.add("United States");
	hset.remove("Denmark");

	Iterator<String>it = hset.iterator();
	while(it.hasNext());
	{ 
		System.out.println(it.next());
	}
	
}
}