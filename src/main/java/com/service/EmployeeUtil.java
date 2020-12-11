package com.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.model.Employee;

public class EmployeeUtil {
	
	public static Session getSessionFactory(){
		
		SessionFactory sf = null;
		Session session = null;
		try{
			sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();	
		}catch(Exception e){
			e.printStackTrace();
		}
	
		return session;	
	}
	public static void saveEmployee(Employee emp){
		Session s = null;
		try{
			 s = EmployeeUtil.getSessionFactory();
			 Transaction tc = s.beginTransaction();
			if(s!=null){
				s.saveOrUpdate(emp);
				tc.commit();
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			s.close();
		}
	}
	public static Employee getEmployeeByEmail(String email,String pass){
		Session s = null;
		
		Employee employee = null;
		try{
			s = EmployeeUtil.getSessionFactory();
			System.out.println("email is "+pass);
			Query q = s.createQuery("from Employee  where email = :email and pass = :pass",Employee.class);
			q.setParameter("email", email);
			q.setParameter("pass", pass);
			List<Employee> li = q.list();
			for(Employee emp : li){
			int id = emp.getEmployee_id();
			employee = s.get(Employee.class,id);
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally{
			s.close();
		}
		return employee;	
	}
	public static List<Employee> getAllEmployee(){
		List<Employee> li = null;
		Session session = null;
		try{
		session = EmployeeUtil.getSessionFactory();
		//Query q = session.createQuery("from Employee");
		Criteria c = session.createCriteria(Employee.class);
		c.addOrder(Order.asc("employee_id"));
		li = c.list();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return li;
	}
	public static void deleteEmployee(int id){
		Session session = null;
		try{
			session = EmployeeUtil.getSessionFactory();
			Employee emp = session.get(Employee.class, id);
			System.out.println(emp);
			Transaction tc = session.beginTransaction();
		    session.delete(emp);
		    tc.commit();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}	
	}
	public static List<Employee> getEmployeeBySearch(String name){
		Session session = null;
		List<Employee> li = null;
		try{
			session  = EmployeeUtil.getSessionFactory();
			Criteria cr = session.createCriteria(Employee.class);
			cr.add(Restrictions.like("employee_fname", name+"%"));
			li = cr.list();	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return li;	
	}
	public static Employee getEmployeeById(int id){
		Session session = null;
		Employee emp = null;
		try{
			session = EmployeeUtil.getSessionFactory();
			emp = session.get(Employee.class, id);	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return emp;
		
	}

}
