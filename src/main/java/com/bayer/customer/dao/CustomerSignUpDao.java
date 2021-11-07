package com.bayer.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bayer.customer.bean.CustomerAccountBean;
import com.bayer.database.DbConnection;

public class CustomerSignUpDao {
	PreparedStatement ps = null;
	PreparedStatement ps1 = null;
	ResultSet rs = null;
	ResultSet rs1 = null;
	String timeStamp = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());;
	 
	public Boolean signUp(CustomerAccountBean data) {
		try {
		   Connection con = new DbConnection().getConnection();
		   ps = con.prepareStatement("INSERT INTO bayer.users_customer(first_name,last_name,email,password,mobile_number,creation_date,last_access_date,is_enabled) VALUES(?,?,?,?,?,?,?,?)");
		   ps.setString(1, data.getFirst_name());
		   ps.setString(2, data.getLast_name());
		   ps.setString(3, data.getEmail());
		   ps.setString(4, data.getPassword());
		   ps.setLong(5, data.getMobile_number());
		   ps.setString(6, timeStamp);
		   ps.setString(7, timeStamp);
		   ps.setInt(8, 1);
		   int count = ps.executeUpdate();
		   if(count > 0) {
			   return true;
		   }
		   
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return false;
	}
	

}
