package org.stu;

public class Student {
	
	public void studentId(long id) {
		System.out.println("StudentId-12345");	
		
	}
	
	public void studentId(int year,String name,float fees) {
		System.out.println("Student joining-year");	
		System.out.println("Student name-name");
		System.out.println("Student fees-fees");
		
	}
	
	public void studentId(float fees ,String name,int year) {
		System.out.println("Student fees-fees");	
		System.out.println("Student name-name");
		System.out.println("Student joining-year");
	
}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId(9566098764l);
		s.studentId(2016, "dinesh", 160000f);
		s.studentId(16000f, "dinesh", 2016);
	}
	
}
