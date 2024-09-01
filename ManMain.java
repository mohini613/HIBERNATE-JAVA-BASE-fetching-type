package com.FetchingType1stLevelCache;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ManMain {
	public static void main(String [] args) {
		
	
SessionFactory sf= HibernateUtill.getSessionFactory();

   Session session = sf.openSession();
   Session session1 = sf.openSession();

   /*CityMan c= new CityMan();
    c.setPinCode(43101);
    c.setAreaName("Downtown");
    
    
    
   Man m= new Man();
   m.setMId(100);;
   m.setMName("Amol ");
   m.setMCity(c);  
   
   session.save(m);

   Transaction tx = session.beginTransaction();
   tx.commit();*/
   Man m= session.get(Man.class, 102);
   System.out.println(m);
   
   Man m1= session1.get(Man.class, 102);
   System.out.println(m1);
   
session.close();
    		   sf.close();
  }
}
//getting data
/* Man m=  session.get(Man.class, 102);//when we the the primary key from database then only  we can use get method
System.out.println(m); */   
  
  //using load method
 // Create an HQL query to fetch all records from the Man table
/*  Query<Man> query = session.createQuery("FROM Man", Man.class);

 // Execute the query and get the result list
 List<Man> results = query.getResultList();

 // Iterate through the results and print each record
 for (Man man : results) {
     System.out.println("ID: " + man.getMId() + ", Name: " + man.getMName() + ", City: " + man.getMCity());
 } 
  //System.out.println(m);*/
