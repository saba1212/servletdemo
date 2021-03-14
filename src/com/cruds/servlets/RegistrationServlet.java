package com.cruds.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first= request.getParameter("firstname");
		String last= request.getParameter("lastname");
		String phonenumber= request.getParameter("phonenumber");
		String address= request.getParameter("address");
		String e_mail= request.getParameter("e_mail");
		System.out.println("address"+address);
		
	
			response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			String title = "REGISTRATION FORM";
		      String docType =
		         "<!DOCTYPE html>\n";
		         
		      pw.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		               "<ul>\n" +
		               
		                  "  <li><b>FIRST  NAME</b>: "
		                        + first + "\n" +
		                  
					"  <li><b>LAST  NAME</b>: "
						+ last + "\n" +
					
					"  <li><b>PHONE NUMBER</b>: "
						+ phonenumber + "\n" +
					
				"  <li><b>ADDRESS</b>: "
					+ address + "\n" +
		                  
                             "  <li><b>E-MAIL</b>: "
                                 + e_mail + "\n" +          
		               "</ul>\n" +
		            "</body>" +
		         "</html>"
		      );

			

			
	}
	}
	


