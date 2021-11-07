package com.bayer.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bayer.customer.bean.CustomerAccountBean;
import com.bayer.database.DbConnection;

public class CustomerLoginDao {
	PreparedStatement ps = null;
	PreparedStatement ps1 = null;
	ResultSet rs = null;
	ResultSet rs1 = null;
	String timeStamp = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());;
	
	
	public int accountLogin(CustomerAccountBean data) {
		int account_id = 0;
		String name = null;
		try {
			   Connection con = new DbConnection().getConnection();
			   ps = con.prepareStatement("SELECT * FROM users_customer WHERE email = ? and password = ?");
			   ps.setString(1, data.getEmail());
			   ps.setString(2, data.getPassword());
			   rs = ps.executeQuery();
			   while(rs.next()) {
				  account_id = rs.getInt("id");
				  name = rs.getString("first_name") + " " + rs.getString("last_name");
				  System.out.println("accountLogin() : " + account_id + ", " + name);
				  return account_id;
			   }
			   
			}catch(Exception e) {
				e.printStackTrace();
			}
				
		
		return account_id;
	}

}
