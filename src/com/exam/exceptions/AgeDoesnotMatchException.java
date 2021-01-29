package com.exam.exceptions;

public class AgeDoesnotMatchException  extends Exception {
	
	AgeDoesnotMatchException (){
		
		System.out.println("Age is not between 17 and 24");
	}

}
