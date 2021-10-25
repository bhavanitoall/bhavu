package com.HotelRegistration;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Adminloginservlet
 */
@WebServlet("/Adminloginservlet")
public class Adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		Adminlogininfo login=new Adminlogininfo(uname,pass);
		Adminlogindata ldata=new Adminlogindata();
		try{
			String result=ldata.AdminloginCheck(login);
			response.getWriter().print(result);
			System.out.print("Result: "+result);
			if(result.equals("Success"))
			{
				
				AdminHomeSqlconn cdata=new AdminHomeSqlconn();
				//System.out.println("Inside doPost HomeServlet!!");
				try {
					ArrayList<AdminHomeInfo> results=cdata.fetchroomlist();
					//System.out.println("ArrayList---\n SNO: " + results.get(0).getSno() + "Room Number: "+ results.get(0).getRoom_Number() + "Room Name: " + results.get(0).getRoom_Name());
					 request.setAttribute("availability", results);
					 
					  
					
			response.sendRedirect(request.getContextPath()+"/AdminHome.jsp");
			}catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			}
			else {
				response.sendRedirect(request.getContextPath()+"/error.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		doGet(request, response);
	}

}
