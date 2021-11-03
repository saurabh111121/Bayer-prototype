package com.bayer.customer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bayer.customer.bean.SignUpBean;
import com.bayer.customer.dao.SignUpDao;

@WebServlet("/customerSignUp")
public class CustomerSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CustomerSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email_signUp");
		long mobile_number = Long.parseLong(request.getParameter("mobile_number"));
		String password = request.getParameter("password_signUp");
		
		SignUpBean data = new SignUpBean();
		data.setFirst_name(first_name);
		data.setLast_name(last_name);
		data.setEmail(email);
		data.setMobile_number(mobile_number);
		data.setPassword(password);
		
		boolean result = new SignUpDao().signUp(data);
		if(result) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("signUp.jsp");
		}
		
		
		
	}

}
