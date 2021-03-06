package com.bayer.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bayer.database.DbConnection;

public class CustomerProfileDao {
	 PreparedStatement ps = null;
	PreparedStatement ps1 = null;
	 ResultSet rs = null;
	ResultSet rs1 = null;
    Connection con = null;
	String timeStamp = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());;
	
	public String fetchDeatils(int account_id) {
		List<String> list = new ArrayList<String>();
		try {
			   con = new DbConnection().getConnection();
			   ps = con.prepareStatement("SELECT * FROM users_customer WHERE id = ?");
			   ps.setInt(1, account_id);
			   rs = ps.executeQuery();
			   while(rs.next()) {
				   list.add("\""
			               +  account_id +"\", \""
                           +  rs.getString("first_name")+"\", \""
                           +  rs.getString("last_name")+"\", \""
                       	   +  rs.getString("email")+"\", \""
             			   +  rs.getLong("mobile_number")+"\", \""
                		   +  rs.getString("creation_date") 
                          +"\"");
			   }
			   
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					ps.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		
		return list.toString();
	}
	
}
