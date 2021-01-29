package com.exam.exceptions;

public class NumberTooLargeException extends Exception {

	NumberTooLargeException() {

		System.out.println("number is bigger than 10000");
	}
}
