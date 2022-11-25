package com.javabasicrecaps;


import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
public static void main(String[] args) {
	
	LinkedList<Integer> linky = new LinkedList<Integer>();
	
	linky.add(6);
	linky.add(78);
	linky.add(89);
	
	
	System.out.println(linky.get(1));
	
	Iterator it = linky.iterator();
	while(it.hasNext()) {
		if((int)it.next()==89) {
			System.out.println("We found 89");
			System.out.println();
		}
	}
}
}
