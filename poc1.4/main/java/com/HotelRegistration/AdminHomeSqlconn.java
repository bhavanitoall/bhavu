package com.HotelRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminHomeSqlconn {
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
	
	public void updateStatus(String Roomnum) throws ClassNotFoundException, SQLException
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String sql="update rooms set status='Not available' where Room_number='"+Roomnum+"'";
		Statement smt = con.createStatement();
		smt.executeUpdate(sql);
		System.out.println("Updated");
	}
	public ArrayList<AdminHomeInfo> fetchroomlist() throws SQLException, ClassNotFoundException
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String sql="select * from rooms";
		ArrayList<AdminHomeInfo> hmlist=new ArrayList<AdminHomeInfo>();
		try
		{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		
		
		while(rs.next()) {
			AdminHomeInfo home=new AdminHomeInfo();
			home.setSno(rs.getString("s.no"));
			home.setRoom_Number(rs.getString("Room_Number"));
			home.setRoom_Name(rs.getString("Room_Name"));
			home.setStatus(rs.getString("status"));
			hmlist.add(home);
			

		}
		
		return hmlist;
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return hmlist;
		
	}
}
