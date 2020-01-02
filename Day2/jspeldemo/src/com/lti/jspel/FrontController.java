package com.lti.jspel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public FrontController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vehicle v1=new Vehicle(1111,"BMW");
		Vehicle v2=new Vehicle(1234,"Audi");
		
		Employee e1=new Employee(101,"Jay",2345,v1);
		Employee e2=new Employee(202,"Niraj",23456,v2);
		
		getServletContext().setAttribute("employee",e1);
		response.sendRedirect("employeeinfo.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
