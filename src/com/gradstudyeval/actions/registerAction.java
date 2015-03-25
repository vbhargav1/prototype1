package com.gradstudyeval.actions;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gradstudyeval.hibernate.postgres.HibernateUtil;
import com.gradstudyeval.hibernate.postgres.Member;
import com.opensymphony.xwork2.ActionSupport;

public class registerAction extends ActionSupport{
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("setting firstName "+firstName);
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("setting LastName "+lastName);
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		System.out.println("setting emailId "+emailId);
		this.emailId = emailId;
	}
	
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setting Password"+password);
		this.password = password;
	}
	
	public String execute() throws Exception{
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Member where emailid = :emailid");
        System.out.println(this.emailId);
        query.setParameter("emailid", this.emailId);
        List<Member> list = query.list();
        if(list.size()==0){
        	Member member = new Member();
        	member.setId("md5ofuserinformation");
            member.setFirstName(this.firstName);
            member.setLastName(this.lastName);
            member.setEmailId(this.emailId);
            member.setPassword(this.password);
            member.setIsadmin(false);
            session.save(member);
        }
        tx.commit();
		return SUCCESS;
	}

}
