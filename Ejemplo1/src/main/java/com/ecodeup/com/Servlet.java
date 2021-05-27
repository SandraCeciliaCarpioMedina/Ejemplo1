package com.ecodeup.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@SuppressWarnings("unused")
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    	/*getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request,response);*/
    	
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	/*	String yourName = request.getParameter("yourName");
    	Person person = new Person();
    	person.setName(yourName);
    	person.setAge(17);
    	request.setAttribute("person",person);
        RequestDispatcher dispatcher =
 				request.getRequestDispatcher("/jsp/welcome.jsp");
 			dispatcher.forward(request,response);*/	
 				
    /* 	
 		PrintWriter writer = response.getWriter();
 		writer.println("<h1> Hola"+ yourName +"</h1>");
 		writer.close();  
	 */ 
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub		
		   /*doGet(request, response);*/
		   response.getWriter().append("Served at: ").append(request.getContextPath());
	    	
	    	String yourName = request.getParameter("yourName");
	    	Person person = new Person();
	    	person.setName(yourName);
	    	person.setAge(17);
	    	request.setAttribute("person",person);
	        RequestDispatcher dispatcher =
	 				request.getRequestDispatcher("/jsp/index.jsp");
	 				dispatcher.forward(request,response); 
	}

}
