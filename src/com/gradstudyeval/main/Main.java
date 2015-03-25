package com.gradstudyeval.main;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gradstudyeval.hibernate.postgres.HibernateUtil;
import com.gradstudyeval.hibernate.postgres.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Member where emailid = :emailid");
        query.setParameter("emailid", "someEmailId");
        List<Member> list = query.list();
        System.out.println(list.size());
        for (Member member : list) {
			System.out.println(member.getEmailId());
		}
        Member member = new Member();
    	member.setId("md5ofuserinformatio");
        member.setFirstName("firstname");
        member.setLastName("lastname");
        member.setEmailId("mad@wc.csc");
        member.setPassword("pa");
        session.save(member);
        tx.commit();
	}
}
