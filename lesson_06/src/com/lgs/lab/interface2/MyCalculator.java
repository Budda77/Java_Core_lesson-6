package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	@Override
	public void add(double num1, double num2) {
		double result = num1 + num2;
		
		System.out.println("Method Plus = " + result);
		
	}

	@Override
	public void subtract(double num1, double num2) {
		double result = num1 - num2;
		
		System.out.println("Method Minus = " + result);
		
	}

	@Override
	public void multiply(double num1, double num2) {
		double result = num1 * num2;
		
		System.out.println("Method Multiply = " + result);
		
	}

	@Override
	public void devide(double num1, double num2) {
		double result = num1 / num2;
		
		System.out.println("Method Devide = " + result);
		
	}

}
