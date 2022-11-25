package com.javabasicrecaps;

import java.util.HashSet;
import java.util.Iterator;

public class HastSet {
		public static void main(String[] args) {
			//CreateHashSet
			
			HashSet<String>hset= new HashSet<>();
			
			//add elements to HashSet
			
			hset.add("Rick");
			hset.add("Murad");
			
			Iterator<String>it= hset.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			
			
			
		}
		
	}

