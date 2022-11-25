package com.javabasicrecaps;

import java.util.ArrayList;

public class ArrayListPro {
public static void main(String[] args) {
	
	String[] fruits = new String[5];
	fruits[0] = "Apple";
	fruits[1] = " Mango";
	fruits[2]= "Kiwi";
	fruits[3]= "Strawberry";
	fruits[4] = "Fig";
	
	System.out.println(fruits);
	
	System.out.println("-------------");
	
	
	
	ArrayList fruitList = new ArrayList();
	fruitList.add("Mango");
	fruitList.add("Strawberry");
	fruitList.add("Peach");
	fruitList.add("Fig");
	fruitList.add("Kiwi");
	
	fruitList.remove("Strawberry");
	//fruitList.clear();
	System.out.println(fruitList.contains("Mango"));
	
	System.out.println(fruitList + " ");
	
	
}
}
