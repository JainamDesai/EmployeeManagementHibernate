package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Employee;
import com.service.EmployeeUtil;

/**
 * Servlet implementation class UpdateEmployeeController
 */
public class UpdateEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			int id = Integer.parseInt(request.getParameter("id"));
			Employee emp = EmployeeUtil.getEmployeeById(id);
			out.println("<form action = EmployeeSaveController method = post>");
			out.println("<label>Employee Id:</label>");
			out.println("<input type = number name = id value ="+emp.getEmployee_id()+"><br>");
			out.println("<label>Employee First Name:</label>");
			out.println("<input type = text name = name value ="+emp.getEmployee_fname()+"><br>");
			out.println("<label>Employee Last Name:</label>");
			out.println("<input type = text name = lname value = "+emp.getEmployee_lname()+"><br>");
			out.println("<label>Employee Email:</label>");
			out.println("<input type = text name = email value = "+emp.getEmail()+"><br>");
			out.println("<button type = submit>submit</button>");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
