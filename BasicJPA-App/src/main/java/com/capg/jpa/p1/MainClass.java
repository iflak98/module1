package com.capg.jpa.p1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----
		Scanner sc=new Scanner(System.in);
		Account a = new Account();
		a.setAccId(101);
		a.setAccountHolderName("Ramesh");
		a.setBalance(2000);
		session.save(a); 
		Account b = new Account();
		b.setAccId(102);
		b.setAccountHolderName("RSuresh");
		b.setBalance(2001);
		
		
		 // insert into Account .....
		session.save(b);
		System.out.println("  -->> Data Saved ..");
		t.commit();
		
		
		
		
		
		session.close();
		System.out.println("All Done");
		
		
	}
}
