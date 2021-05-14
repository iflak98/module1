package com.capg.jpa.stud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Mystudent" )
public class Student {
	
	@Id
	@Column (name= "Id" )
	private int id;
	@Column(name= "Usn" )
	private String usn;
	@Column(name= "Name" )
	private String name;
	@Column(name= "Marks" )
	private int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id, String usn, String name, int marks) {
		super();
		this.id = id;
		this.usn = usn;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
