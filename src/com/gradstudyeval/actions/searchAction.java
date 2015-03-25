package com.gradstudyeval.actions;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gradstudyeval.hibernate.postgres.HibernateUtil;
import com.gradstudyeval.hibernate.postgres.Member;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class searchAction extends ActionSupport {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("setting Email "+email);
		this.email = email;
	}
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setting Password "+password);
		this.password = password;
	}
	
	public String execute() throws Exception{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
        /*Query query = session.createQuery("from Member where emailid = :emailid");
        query.setParameter("emailid", this.email);
        List<Member> list = query.list();
        for(Member member : list){
        	System.out.println(member.getPassword());
        	if(member.getPassword().compareTo(this.password) == 0){
        		System.out.println("RESULT SUCCESS");
        		Map userSession = (Map) ActionContext.getContext().get("session");
                userSession.put("email", this.email);
        		return SUCCESS;
        	}else{
        		return ERROR;
        	}
        }
        tx.commit();
        System.out.println("RESULT ERROR");
		return ERROR;*/
		HttpServletResponse response = ServletActionContext.getResponse();
	    System.out.println("doing post");
	    response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    out.println("{results:['University of Arizona':'link to it']}");
	    out.close();
		return NONE;	
	}
  

}
