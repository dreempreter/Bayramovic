package com.javabasicrecaps;

import java.util.ArrayList;

public class Homework1 {
//create arraylist of drinks. If any drink has a letter with a or e replace with water
	public static void main(String[] args) {
		
		ArrayList<String>drinks=new ArrayList();
		
		drinks.add("Milk");
		drinks.add("Coffe");
		drinks.add("Whiskey");
		drinks.add("Tea"); // 
		drinks.add(1, "water");
		drinks.add(3, "coffe");
		
		for(String drink:drinks)
		{
			if(drink.contains("a") || drink.contains("e"))
				//we did not change array
				drink =drink.replace(drink, "water");
			System.out.print(drink + " ");
		}
		System.out.println();
		System.out.println(drinks);
		
		
		for(int a =0; a<drinks.size(); a++)
		{
			if(drinks.get(a).contains("a")|| drinks.get(a).contains("e"))
			{
				drinks.set(a, "water");
			}
			
			System.out.println(drinks);
			
		}
	}
}
