package com.bayer.customer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bayer.customer.bean.CustomerAccountBean;
import com.bayer.customer.dao.CustomerLoginDao;

@WebServlet("/customerLogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CustomerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		System.out.println("doPost : " + email + " " + pass);
		
		CustomerAccountBean data = new CustomerAccountBean();
		data.setEmail(email);
		data.setPassword(pass);
		
		int account_id = new CustomerLoginDao().accountLogin(data);
		System.out.println("account_id : " + account_id);
		if(account_id == 0) {
			System.out.println("id was 0 ");
			response.sendRedirect("login.jsp");
		}else {
			 request.setAttribute("account_id", account_id);
			 response.sendRedirect("./profile");
		}
		
		
		
	}

}
