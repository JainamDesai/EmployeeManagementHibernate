package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.EmployeeUtil;

/**
 * Servlet implementation class deleteEmployee
 */
public class deleteEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			int id = Integer.valueOf(request.getParameter("id"));
			System.out.println(id+"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
			EmployeeUtil.deleteEmployee(id);
			RequestDispatcher rd = request.getRequestDispatcher("deleteMessage.jsp");
			rd.forward(request, response);
			
		}catch(Exception h){
			h.printStackTrace();
		}

	}


}
