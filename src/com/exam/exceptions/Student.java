package com.exam.exceptions;

import java.util.Scanner;

public class Student {

	private String name;

	private int age;

	Student(String name, int age) throws AgeDoesnotMatchException {

		if (age >= 17 && age <= 24) {
			this.name = name;
			this.age = age;
			System.out.println("On executing this program");
		} else {

			throw new AgeDoesnotMatchException();
		}

	}

	public static void main(String[] args) throws AgeDoesnotMatchException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String name = sc.next();

		int age = sc.nextInt();
		try {
			Student st = new Student(name, age);
			
		}catch (Exception ex) {
			
			System.out.println("exception");
		}
		

	}

}
