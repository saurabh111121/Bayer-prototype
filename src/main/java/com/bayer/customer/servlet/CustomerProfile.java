package com.bayer.customer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/customerProfile")
public class CustomerProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CustomerProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int account_id = Integer.parseInt(request.getParameter("account_id"));
		Object account_id = request.getAttribute("account_id");
		
		request.setAttribute("account_id", account_id);
		 RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		 rd.forward(request, response); 
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
