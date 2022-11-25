package com.javabasicrecaps;

public class VariableDemo {
public static void main(String[] args) {
	
	// Declare a variable
	String firstName;
	//System.out.println("My first name is" + fristName);
	
	//Assign a value
	
	firstName = "Murad";
	
	System.out.println(" My name is " + firstName);
	
	// Declare a variable and declare a value
	
	String lastName = "Bayramov";

	int age = 28;
	System.out.println( firstName + " " + lastName + " " + age);
	
	System.out.println( firstName + " " + lastName + " " + (age + 1));
	System.out.println(age);
	
	//After 5 years
	//re-assign a new value in the container
	age +=5;
	
	lastName = " Gurbanov";	
	
	System.out.println(" After getting married");
	
	System.out.println( firstName + " " + lastName + " " + age);
	
	
	
	
	
	
	
	
}
}
