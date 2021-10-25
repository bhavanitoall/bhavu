<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import = "com.HotelRegistration.Homeinfo" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="css/home.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%ArrayList<Homeinfo> homeInfo = new ArrayList<Homeinfo>(); 
  homeInfo = (ArrayList<Homeinfo>)request.getAttribute("availability");
%>
</head>
<body>

<div class="header">
  <h1>Welcome</h1>
  <p>THE RESIDIAN HOTEL</p>
  
  <form action="Login.jsp" method ="post">
   <div class="button">
          <input type="submit" value="Logout" > </button>
        </div>
     </form>
    
      
</div>
 <form action="HomeServlet" method="post"> 
 
 

<table>
        <thead>
            <tr>
                <th>Serial Number</th>
                <th>Room Number</th>
                <th>Room Name</th>
                <th>status</th>
                <th>Booking</th>
            </tr>
       </thead>
        <tbody>
             <% for(int i = 0; i < homeInfo.size(); i++) {
            	Homeinfo Hinfo = new Homeinfo();
                Hinfo = homeInfo.get(i);
                
            %>


            <tr>
                <td><%=Hinfo.getSno()%></td>
                <td><%=Hinfo.getRoom_Number()%></td>
                <td><%=Hinfo.getRoom_Name()%></td>
                <td><%=Hinfo.getStatus() %></td>
                <td><div class="btn-group">
                <input type="button" name = "submit" value=<%=Hinfo.getRoom_Number()%>>
                </div></td>
               </tr>
            <%
            }
            %> 
            
         </tbody>
    </table>
  </form>
    
</body>
</html>