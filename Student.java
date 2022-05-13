package com.pooja.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student //Bean or POJO class
{
	
	@Id
	int rollno;
	String name;
	double marks;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

}
