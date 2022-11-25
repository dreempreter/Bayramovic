package com.javabasicrecaps;

public abstract class Car {

	String type;
	
	public Car(String type)
	{
		this.type = type;
	}
	
	public abstract void drive();
	
	
 class Kia extends Car
 {
	public Kia(String type) {
		super(type);
		
	}

	@Override
	public void drive() {
		System.out.println(type + "is a good car");
		
	}
	
	class Toyota extends Car
	{

		public Toyota(String type) {
			super(type);
			
		}

		@Override
		public void drive() {
		System.out.println(type + " drives so fast");
			
		}
	
	}
 }
	class BMW extends Car
	
	{
	String color;

		public BMW(String type) {
			super(type);
			this.color = color;
		}

		@Override
		public void drive() {
		System.out.println(type + " is very expensie");
			
		}
		
		
	}
 }
	
	
	
	
	
	
	
	
 
