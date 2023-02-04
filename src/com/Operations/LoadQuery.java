package com.Operations;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;

@SuppressWarnings("deprecation")
public class LoadQuery {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(person.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	Query query=session.createQuery("from person");
	ArrayList<person>plist=(ArrayList<person>) query.list();
		/*Criteria criteria=session.createCriteria(person.class);  //select * from person
		criteria.add(Expression.eq("name","xyz"));*/
	
		//	ArrayList<person>plist=(ArrayList<person>) criteria.list();
		System.out.println(plist);
		for(person p:plist){
			System.out.println(p);
		}
	}
	
	}

