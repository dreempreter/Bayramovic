package com.javabasicrecaps;

public class Account {
	
	String name;
	int age;
	
	public void printDetails()
	{
		System.out.println(name + " , " + age);
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		Account a = new Account();
		
		
		a.setAge(24);
		a.setName("Murad");
		System.out.println(a.getAge() + " ");
		System.out.println(a.getName() + " ");
		a.printDetails();
		
		
	}
	

	
}
