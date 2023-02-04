package com.Operations;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;

public class Update{

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(person.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(person.class);  //select * from person
		criteria.add(Expression.eq("name","karan"));     //where condition
		
		ArrayList<person>plist=(ArrayList<person>) criteria.list(); 
		System.out.println(plist);
		for(person p:plist){
			System.out.println(p);
		}
		
	}
}
