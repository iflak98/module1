package com.capg.jpa.stud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainclass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		Student a=new Student();
		a.setId(3);
		a.setMarks(300);
		a.setName("shahid");
		a.setUsn("1nh17cs054");
		Student b=new Student(2, "1nh17cs044", "gaurav", 233);
		
		//System.out.println(a.getId()+"  "+a.getMarks()+"  "+a.getName()+"  "+a.);
		
		session.saveOrUpdate(b);
		session.saveOrUpdate(a);
		System.out.println("  -->> Data Saved ..");
		t.commit();
		session.close();
		System.out.println("All Done");
	}
	
}
