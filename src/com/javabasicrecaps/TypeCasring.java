package com.javabasicrecaps;

public class TypeCasring {

	public static void main(String[] args) {
		
		System.out.println(" Hi there");
		
	// byte<short<int<long<float<double
		
		
		int intNumber = 50;
		
		//widening/implicit casting / automatically
		
		double doubleNumber = intNumber;
		
		System.out.println("intNumber-->" + intNumber);
		System.out.println("doubleNumber-->" +doubleNumber);
		
		
		//narrowing/ explicit/ manually
		byte byteNumber = (byte) intNumber; //its risky, you may loose data
		System.out.println( " byteNumber " + byteNumber);
		
		//re-assign
		intNumber = 870;
		byte b2 = ( byte)intNumber;
		// in this case we WILL loose data
		System.out.println(b2);
		
		//widening
		byte b3 = 90;
		int i3 = b3;
		System.out.println(i3);
		
		
		
		
		
		
	}
	
	
	
	
}
