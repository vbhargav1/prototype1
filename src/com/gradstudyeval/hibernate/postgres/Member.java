package com.gradstudyeval.hibernate.postgres;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sun.org.apache.xpath.internal.operations.Bool;
 
@Entity
@Table(name = "Member")
public class Member implements java.io.Serializable {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column (name = "emailid")
	private String emailid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "isadmin")
	private Boolean isadmin;
	
	public Member() {
	}
 
	public Member(String id,String firstName, String lastName,String emailId,String password,Boolean isadmin) {
		this.id=id;
		this.firstname = firstName;
		this.lastname = lastName;
		this.emailid = emailId;
		this.password = password;
		this.isadmin = isadmin;
	}

	
	public Boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getEmailId() {
		return emailid;
	}

	public void setEmailId(String emailId) {
		this.emailid = emailId;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}