package com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Dao {
	public String insertData(Bean bean) {
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into example values(?,?,?,?)");
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getEmail());
			ps.setString(4, bean.getPassword());
			int a = ps.executeUpdate();
			return ""+a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "0";
	}
	public Bean validateData(String name, String password) {
		try {
			Connection con = DatabaseConnection.getConnection();
			System.out.println("Conn done");
//			 java.sql.Statement st = con.createStatement();
//			 ResultSet rs = st.executeQuery("select * from example where name="+name);
			 PreparedStatement ps = con.prepareStatement("select * from example where name=?");
			 ps.setString(1, name);
			 ResultSet rs= ps.executeQuery();
			 
			 System.out.println("RS done");
			 rs.next();
			 System.out.println(rs.getString(1));
			 if(password.equals(rs.getString(4))) {
				 System.out.println("Password Matched"+rs.getString(4));
				 Bean bean = new Bean();
				 bean.setName(rs.getString(1));
				 bean.setAge(rs.getInt(2));
				 bean.setEmail(rs.getString(3));
				 bean.setPassword(rs.getString(4));
				 return bean;
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
