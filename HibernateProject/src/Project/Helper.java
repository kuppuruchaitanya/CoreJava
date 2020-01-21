package Project;

import org.hibernate.HibernateException; 
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;
import Project.MyPojo;
import org.hibernate.cfg.Configuration; 
public class Helper {
    public static void main(String[] args) {
       try{
           Configuration cn=new Configuration();
           SessionFactory sf=cn.configure().buildSessionFactory();
           Session s=sf.openSession();
           Transaction tn=s.beginTransaction();
           Project.MyPojo obj=new Project.MyPojo();
           obj.setId(103);   
           obj.setName("valan");    
           obj.setSal(20000);
           s.save(obj); // Inserting a Record
           tn.commit();
       }catch(HibernateException e){
           System.out.println(e.getMessage()); }
    }  }
