package com.HotelRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterData {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbname ="root";
	private String dbpassword="Panjanayagi8!";
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
	public String insert(Registerinfo member1) throws SQLException, ClassNotFoundException
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result=("Data Entered");
		String sql="insert into member1 values(?,?,?,?,?,?)";
		try
		{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,member1.getFname());
		ps.setString(2,member1.getLname());
		ps.setString(3,member1.getUname());
		ps.setString(4,member1.getPass());
		ps.setString(5,member1.getDob());
		ps.setString(6,member1.getPhone());
		ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			result="Data not entered";
		}
		return result;
		
	}
	
}
