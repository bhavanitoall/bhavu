<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="css/login.css">
<meta charset="ISO-8859-1">
<title>ADMIN LOGIN THE DETAILS</title>
</head>
<body>
<form action="Adminloginservlet" method ="post">
<table>
<tr>
            <div class="container">
	
           <div class="title"> ADMIN LOGIN</div>
            <div class="content">
            <form action="Loginservlet" method ="post">
                 <div class="user-details">
        
			<div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="uname" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name="pass" placeholder="Enter your Password"  required>
            
			<div class="button">
          <input type="submit" value="login" > </button>
        </div>
        
         <nav class="nav2">
        
		<a href="Member.jsp" >REGISTRATION</a> 
		
		</nav>
		 
        </div>
        </div>
        
		</div>	
     </table>
     

</body>
</html>