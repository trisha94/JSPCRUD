package com;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loaded!!!!!!!!!!!!!!!!!!!");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrude", "root", "qwe321");
			System.out.println("Connected!!!!!!!!!!!!!1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;

	}
}
