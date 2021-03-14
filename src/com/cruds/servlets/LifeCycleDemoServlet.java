package com.cruds.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleDemoServlet
 */
public class LifeCycleDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleDemoServlet() {
        super();
        System.out.println("LIFE CYCLE CONSTRUCTOR===>>>");
    }
    
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	 
    	super.init(config);
    	
    	
    	System.out.println("LIFE CYCLE INIT METHOD===>>>");
    }

    
    @Override
    public void destroy() {
    
    	super.destroy();
    	System.out.println("LIFE CYCLE DESTROY===>>>");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String param1= request.getParameter("param1");
		String param2= request.getParameter("param2");
		String param3= request.getParameter("param3");
		response.getWriter().append("served at : ").append(param1+ param2 + param3);
		
		//System.out.println("LIFE CYCLE DO GET METHOD===>>>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
