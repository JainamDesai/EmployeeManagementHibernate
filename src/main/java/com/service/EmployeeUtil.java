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
				s.save(emp);
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
		    session.delete(emp);	
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		
	}

}
