package com.HotelRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logindata {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbname ="root";
	private String dbpassword="1234";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver) throws ClassNotFoundException
	{
		Class.forName(dbdriver);
	}
	
	public Connection  getConnection() throws SQLException
	{
		Connection con = null;
		try {
			con= DriverManager.getConnection(dburl,dbname,dbpassword);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public String loginCheck(logininfo login) throws SQLException, ClassNotFoundException
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data successfully entered";
		String sql="SELECT*FROM member WHERE uname = ? and pass = ?";
		try
		{
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1,login.getUname());
		ps.setString(2,login.getPass());
		ResultSet rs=ps.executeQuery();
		 while(rs.next())
         {
           
              String dbuname=rs.getString("uname");
              String dbpwd=rs.getString("pass");
           if(dbuname.equals(login.getUname())&& dbpwd.equals(login.getPass()))
         {
        	  
        	   return "Success";
         
       
        // Object session;
		//session.setAttribute("uname",dbuname);
         //session.setAttribute("pass",dbpwd);
         //response.sendRedirect("Home.jsp");
         }
           
           
         }
         //response.sendRedirect("error.jsp");
         rs.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
		
	}
	
}

