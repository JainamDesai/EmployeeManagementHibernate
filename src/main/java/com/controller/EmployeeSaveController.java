package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.EmployeeUtil;

/**
 * Servlet implementation class EmployeeSaveController
 */
public class EmployeeSaveController extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String emp_name = request.getParameter("name");
			String emp_lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			String city = request.getParameter("city");
			String gender = request.getParameter("gender");
			Employee emp = new Employee();
			emp.setCity(city);
			emp.setEmail(email);
			emp.setEmployee_fname(emp_name);
			emp.setEmployee_lname(emp_lname);
			emp.setGender(gender);
			emp.setPass(pass);
			EmployeeUtil.saveEmployee(emp);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
