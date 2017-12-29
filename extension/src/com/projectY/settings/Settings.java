package com.projectY.settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Settings {

	public static Connection conn = null;
	public static Connection updateConn = null;
	
	public Settings ()//throws SQLException, ClassNotFoundException updateConn
	{
		if(conn==null)
		{
		 
			try {
				Class.forName("com.mysql.jdbc.Driver");
		
		 conn =
			       DriverManager.getConnection("jdbc:mysql://localhost/frinser","ishu","");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		if(updateConn==null)
		{
		 
			try {
				Class.forName("com.mysql.jdbc.Driver");
		
				updateConn =
			       DriverManager.getConnection("jdbc:mysql://localhost/frinser","ishu","");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		//else
			//System.out.println("Conn already initialized");
		
	}
	public static Connection getConn()
	{
		try {
			if(conn==null || conn.isClosed())
			{
			 
				try {
					Class.forName("com.mysql.jdbc.Driver");
			
			 conn =
				       DriverManager.getConnection("jdbc:mysql://localhost/frinser","ishu","");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static Connection getUpdateConn()
 {
		try {
			if (updateConn == null || updateConn.isClosed()) {

				try {
					Class.forName("com.mysql.jdbc.Driver");

					updateConn = DriverManager.getConnection(
							"jdbc:mysql://localhost/frinser", "ishu", "");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updateConn;
	}
	public static void main(String we[])
	{
		new Settings();
		System.out.println(new java.util.Date().getTime());
	}
}
