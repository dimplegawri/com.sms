package com.ska.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Student extends Person{

	@Column(name = "class_name")
	private String className = "";
	
	@Column(name = "address")
	private String address = "";
	
	public Student() {}

	public Student(String className, String address) {
		super();
		this.className = className;
		this.address = address;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
