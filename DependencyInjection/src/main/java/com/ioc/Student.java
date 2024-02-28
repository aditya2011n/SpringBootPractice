package com.ioc;

public class Student {

	private String studentName;
	private int id;
	
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	
	public Student(int id) {
		super();
		this.id = id;
	}

//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public void displayStudent() {
		System.out.println("Student id is -:"+id+"\t"+"Student name is -:" + studentName);
	}
}
