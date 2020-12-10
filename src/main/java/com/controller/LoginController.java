package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.EmployeeUtil;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			Employee employee = EmployeeUtil.getEmployeeByEmail(email, pass);
			out.println("<h1>....................Employee Information................</h1>");
			out.println("<h3>Name is : "+employee.getEmployee_fname()+" </h3>");
			out.println("<h3>Last Name is : "+employee.getEmployee_lname()+" </h3>");
			out.println("<h3>Email is : "+employee.getEmail() + " </h3>");
			out.println("<h3>City is : "+employee.getCity() +" </h3>");
			out.println("<h5><a href = index.jsp>go to home</a></h5>");
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}


}
