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
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
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
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		logininfo login=new logininfo(uname,pass);
		logindata ldata=new logindata();
		try{
			String result=ldata.loginCheck(login);
			response.getWriter().print(result);
			System.out.print("Result: "+result);
			if(result.equals("Success"))
			{
				
				HomeSqlconn cdata=new HomeSqlconn();
				//System.out.println("Inside doPost HomeServlet!!");
				try {
					ArrayList<Homeinfo> results=cdata.fetchroomlist();
					//System.out.println("ArrayList---\n SNO: " + results.get(0).getSno() + "Room Number: "+ results.get(0).getRoom_Number() + "Room Name: " + results.get(0).getRoom_Name());
					 request.setAttribute("availability", results);
					 
					  
					 
					 try {
						 
						 String destpage="Login.jsp";
					 
					 if (login!= null) {
			                HttpSession session = request.getSession();
			                session.setAttribute("login", login);
			                destpage = "Home.jsp";
					
					
			            RequestDispatcher view = request.getRequestDispatcher(destpage);
			            view.forward(request, response);
					 }
					 
			} 
				catch (Exception e) {
				
				e.printStackTrace();
			}
			//	response.sendRedirect(request.getContextPath()+"/Home.jsp");
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
	

	
