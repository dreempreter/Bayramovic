package com.javabasicrecaps;

public class WrapperClass {
public static void main(String[] args) {
	
	int num = 10;
	
	Integer number1 = new Integer(20); //boxing: putting int inside the
	//Integer object
	
	int num25 = number1.intValue(); //un-boxing getting the value 
	//from the object
	
	Integer number2 = 3500; //auto-boxing (automatic): converting from primitive to Object
	
	int num26 = number2; //java in the background does auto-boxing/ converting from object to primitive
	
	System.out.println(number1.toString());
	
	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;
	System.out.println("min " + min);
	System.out.println("max " + max);
	
	
	System.out.println("---Other Wrapper Classes---");
	//Boolean bool1 = new Boolean(false);----> this is old way not famous anymore;

	Boolean bool2 = true;
	System.out.println(bool2);
	
	Byte b1 = 25; //auto-boxing
	System.out.println(b1);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	
	
	Double d = 3.45; 
	
	Character c1= new Character('P'); //old way again 
	Character c2 = 'X';
	
	
	
	
	
	
	
	
}
}
