package com.bayer.customer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bayer.customer.dao.CustomerProfileDao;


@WebServlet("/customerProfile")
public class CustomerProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CustomerProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object account_id = request.getAttribute("account_id");
		int id = (Integer) account_id;
		HttpSession session=request.getSession();  
	    session.setAttribute("account_id",id);  
	    String account_details = new CustomerProfileDao().fetchDeatils(id);
		request.setAttribute("account_details", account_details);
		 RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		 rd.forward(request, response); 
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
