package com.pooja.DemoHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Student s = new Student();
//        s.setRollno(1);
//        s.setName("Pooja");
//        s.setMarks(80.00);
    	Employee emp = new Employee();
    	emp.setEmpno(2);
    	emp.setEmpname("Prem");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf =  con.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
    }
}
