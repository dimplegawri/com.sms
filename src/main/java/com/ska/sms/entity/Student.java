package com.ska.sms.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Student extends Person{

	
}
