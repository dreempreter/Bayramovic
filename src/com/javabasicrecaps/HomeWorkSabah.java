package com.javabasicrecaps;

import java.util.Scanner;

public class HomeWorkSabah {
	public static void main(String[] args) {

		Scanner murad = new Scanner(System.in);

		System.out.println(" Please enter the first number:");

		double d1 = murad.nextDouble();

		System.out.println(" Please enter the second number:");
		double d2 = murad.nextDouble();

		System.out.println("Please etnter the operator ( +,-,*,/)");
		String operator = murad.next();

		if ( operator.equals("+"))
		{
			System.out.println(" The result is -> "  + (d1 + d2) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
