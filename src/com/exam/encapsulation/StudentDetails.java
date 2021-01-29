package com.exam.encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student ();
		st.setName("Jhon");
		st.setAge(22);
		st.setDepartment("IT");
		
		System.out.println("Name : "+st.getName());
		System.out.println("Age : "+st.getAge());
		System.out.println("Departement : "+st.getDepartment());

	}

}
