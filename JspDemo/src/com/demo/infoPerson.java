package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class infoPerson extends HttpServlet {
	
//	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
//		
//		
//		String i = req.getParameter("fname");
//		String j = req.getParameter("lname");
//		PrintWriter out = res.getWriter();
//		out.println("My name is " + i + "  " +j );
//		
//		 
//		 
//	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		{
		
		
		String i = req.getParameter("fname");
		String j = req.getParameter("lname");
//		PrintWriter out = res.getWriter();
//		out.println("My name is " + i + "  " +j );
		
		
		RequestDispatcher rd = req.getRequestDispatcher("demo");
		rd.forward(req,res);
		}
	
}
