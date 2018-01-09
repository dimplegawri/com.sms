package com.ska.sms.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="STAFF")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Staff extends Person{

}
