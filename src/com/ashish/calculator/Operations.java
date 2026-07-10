package com.ashish.calculator;

import java.util.Iterator;

public class Operations {
	
	public int add(int num1, int num2) {
		System.out.println("\n----- Addition -----");
	    return num1 + num2;
	}
	
	public int subtraction(int num1, int num2) {
		System.out.println("\n----- Subtraction -----");
		return num1 - num2;
	}
	
	public int multiplication(int num1, int num2) {
		System.out.println("\n----- Multiplication -----");
		return num1 * num2;
	}
	
	public int division(int num1, int num2) {
		System.out.println("\n----- Division -----");
		if(num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return num1 / num2;
	}

	public int modulus(int num1, int num2) {
		System.out.println("\n----- Modulus -----");
		return num1 % num2;
	}
	
	public int power(int base, int power) {
		System.out.println("\n----- Power -----");
		int answer = 1;
		for(int i = 1; i <= power; i++) {
			answer = answer * base;
		}
		return answer;
	}
	
	public int maximum(int num1, int num2) {
		System.out.println("\n----- Maximum Number -----");
		if (num1 > num2) {
			return num1;
		} else if(num1 == num2) {
			System.out.println("Both numbers are equal.");
			return num1;
		} else { 
			return num2;
		}
	}
	
	public int minimum(int num1, int num2) {
		System.out.println("\n----- Minimum Number -----");
		if (num1 < num2) {
			return num1;
		} else if(num1 == num2) {
			System.out.println("Both numbers are equal.");
			return num1;
		} else {
			return num2;
		}
	}
	
	public double average(int num1, int num2) {
		System.out.println("\n----- Average of Number -----");
		double answer;
		answer = (num1 + num2) / 2.0;
		return answer;
	}
	
	public double percentage(double obtained, double total) {
		double percentage;
		percentage = (obtained / total) * 100;
		System.out.println("\n----- Percentage -----");
		return percentage;
	}
	
	public int square(int num1) {
		System.out.println("\n----- Square -----");
		return num1 * num1;
	}
	
	public int cube(int num1) {
		System.out.println("\n----- Cube -----");
		return num1 * num1 * num1;
	}
	
	public int factorial(int num1) {
		System.out.println("\n----- Factorial -----");
		if(num1 < 0) {
			 System.out.println("❌ Factorial is not defined for negative numbers.");
			 return -1;
		}
		
		int answer = 1;
		for(int i = num1 ; i >= 1; i--) {
			answer = answer * i;
		}
		return answer;
	}
	
	public boolean primeNumber(int num1) {
		System.out.println("\n----- Prime Number Check -----");
		boolean isPrime = true;
		if(num1 <= 1) {
			System.out.println("❌ Prime numbers are greater than 1.");
		    return false;
		}
		for(int i = 2; i < num1; i++) {
			if(num1 % i == 0) {
				isPrime = false;
				break;  
			}
		}
		return isPrime;
	}
	
	public double squareRoot(double num1) {
		System.out.println("\n----- Square Root -----");
		if(num1 < 0) {
			return -1;
		}
		return  Math.sqrt(num1);
	}
} 
