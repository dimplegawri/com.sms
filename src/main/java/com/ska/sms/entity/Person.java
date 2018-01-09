package com.ska.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name = "person_id")
	private Long personId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "mob_no")
	private String mobNo;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="modify_date")
	private Date modifyDate;
	
	public Person() {
	
	}

	public Person(String firstName, String lastName, String mobNo, String gender, Date createdDate, Date modifyDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNo = mobNo;
		this.gender = gender;
		this.createdDate = createdDate;
		this.modifyDate = modifyDate;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
