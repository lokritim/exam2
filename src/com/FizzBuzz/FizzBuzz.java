package com.FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("fizz");
		} else if (num % 5 == 0) {
			System.out.println("buzz");
		} else if (num % 3 == 0) {
			System.out.println("fizzbuzz");
		}

	}

}
