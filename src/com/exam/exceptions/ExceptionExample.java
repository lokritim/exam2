package com.exam.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) throws NumberTooSmallException, NumberTooLargeException, ZeroNumberException{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number");

		try {

			double input = sc.nextDouble();
			
			
			if (input<=10000 && input > 0 ) {
				
				System.out.println("Allocated Memory...");
				
			}else if (input < 0) {
				
				throw new NumberTooSmallException();
				
			}else if (input > 10000) {
				
				throw new NumberTooLargeException();
				
			}
			
			else if (input==0) {
				
				throw new ZeroNumberException();
			}
				
		} catch (Exception ex) {

			System.out.println("not a valid number");

		}

	}

}
