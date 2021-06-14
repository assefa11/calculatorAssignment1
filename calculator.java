package com.simplilearn.assessmentPackage;
public class Calculator {
	public static void main(String[] args) {

		//methods being called 
		add(95, 6);
		subtract(95,6);
		multiply(95, 6);
		divide(95,6);
		sqrt(95);

	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	public static void multiply (int a, int b) {
		System.out.println(a*b);
	}
	public static void divide(int a, int b) {
		System.out.println(a/b);
	}
	public static void sqrt(double a) {
		System.out.println(Math.sqrt(a));
	}

}
