package CRUD;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        m.saveEmployee("k", "MGR", 25000, 10);
        m.saveEmployee("c", "CLERK", 15000, 35);
        m.saveEmployee("k", "SALESMAN", 7500, 17);
        m.retriveEmployee();
        m.deleteEmployee();
        m.updateEmployee();
    }
    public void saveEmployee(String ename,String job,int sal,int deptno){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Employee emp=new Employee();
            emp.setEname(ename);
            emp.setJob(job);
            emp.setSal(sal);
            emp.setDeptno(deptno);
            session.save(emp);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    public void retriveEmployee()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
                        List employee = session.createQuery("from Employee").list();
            for (Iterator iterator = employee.iterator(); iterator.hasNext();)
            {
                Employee employee1 = (Employee) iterator.next();
                System.out.println(employee1.getEmpno()+"  "+employee1.getEname()+"  "+ employee1.getJob()+"   "+employee1.getSal()+"   "+employee1.getDeptno());
            }         
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    public  void  deleteEmployee(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String queryString = "from Employee where deptno = :deptno";
            Query query = session.createQuery(queryString);
            query.setInteger("deptno", 20);
            Employee employee=(Employee) query.uniqueResult();
            session.delete(employee);
            System.out.println("One employee is deleted!");
            transaction.commit();
        
                   
        } 
       
        catch (HibernateException e) {
            transaction .rollback();
            e.printStackTrace();
        } 
        finally {
            session.close();
        }
    }
    public  void  updateEmployee(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String queryString = "from Employee where sal = :sal";
            Query query = session.createQuery(queryString);
            query.setInteger("sal", 8000);
            Employee employee=(Employee) query.uniqueResult();
            employee.setSal(11000);
            session.update(employee);
            System.out.println("One employee is updated!");
            transaction.commit();
        } catch (HibernateException e) {
            transaction .rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}