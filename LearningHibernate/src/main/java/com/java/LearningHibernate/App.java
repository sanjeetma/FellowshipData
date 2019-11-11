package com.java.LearningHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee obj=new Employee();
        obj.setId(103);
        obj.setName("san");
        obj.setCity("Mumbaiiii");
        
        
        Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory factory=config.buildSessionFactory();
        
        Session session= factory.openSession();
        
        Transaction trans=session.beginTransaction();
        
        session.save(obj);
        trans.commit();
    }
}
