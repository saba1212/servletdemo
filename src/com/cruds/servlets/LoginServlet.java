package com.cruds.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid= request.getParameter("userid");
		String password= request.getParameter("pwd");				
		String action= request.getParameter("ACTION");
		
		
		RequestDispatcher rd= null;
		HttpSession session =request.getSession(true);
		
		
		if("logout".equals(action))
		{
			session.invalidate();//session destroy
			rd=request.getRequestDispatcher("login.jsp");
		}
		
		else
		{	
		if(userid.equals("admin") && password.equals("saba") )
		{
			request.setAttribute("MESSAGE", "HELLO! WELCOME");
			//request.setAttribute("USERID", userid);			
			session.setAttribute("USERID", userid);
			
			rd=request.getRequestDispatcher("welcomse.jsp");
			
			
		}
		else
		
		{
			rd=request.getRequestDispatcher("login.jsp");
			//rd=request.getRequestDispatcher("Page2.jsp");
		}
		rd.forward(request, response);
		
		}
		
	 
	
}
	
	//rd.forward(request, response);
}