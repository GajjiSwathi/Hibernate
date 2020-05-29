package com.hibernate.HibernateApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName name=new AlienName();
    	name.setFname("Gajji");
    	name.setLname("Swathi");
    	name.setMname("Patel");
    	
    	
        Alien alien= new Alien();
        alien.setId(112);
        alien.setName(name);
        alien.setColour("red");
        
        
        Configuration configuration= new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry registry=  new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory= configuration.buildSessionFactory(registry);
        Session session= sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(alien);
        Alien a =(Alien) session.get(Alien.class, 104);
       tx.commit();
       System.out.println(a);        
        
        
        
    }
}
