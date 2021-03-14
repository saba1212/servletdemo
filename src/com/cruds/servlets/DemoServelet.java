package com.cruds.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		pw.println("<html><head><title> Demo Servlet</title></head>");
		pw.println("<body>Hello this is<h1> <b><i> Demo Servlet</i> </b></h1>manually writing HTML Body");
		pw.println("</html>");
	}
	
	

}
