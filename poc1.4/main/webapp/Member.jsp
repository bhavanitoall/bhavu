<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="css/Register.css">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.0/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>

</head>
<body>

	<div class="container">
	
    <div class="title">Registration</div>
    <div class="content">
     <form action="Register" method ="post">
        <div class="user-details">
        
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text"  name="fname" placeholder="Enter your firstname" required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text"  name="lname" placeholder="Enter your Lastname" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="uname" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" id="pass" name="pass" placeholder="Enter your Password" placeholder="Enter your Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
            
            
          </div>
          <div class="input-box">
            <span class="details">Date of Birth</span>
            <input type="date" id="datepicker" name="dob"  placeholder="yyyy-mm-dd" required>
          </div>
          <div class="input-box">
            <span class="details">Mobile Number</span>
            <input type="text" name="phone" pattern=".{10}" placeholder="Enter your mobile number" required>
          </div>
          <div class="button">
          <input type="submit" value="Register" > </button>
        </div>
        
        <nav>
        
		<a href="Login.jsp">LOGIN</a> 
		
		</nav>
		<br><br><br>
		
		 <nav>
        
		<a href="AdminLogin.jsp">ADMIN LOGIN</a> 
		
		</nav>         
         </div>
       </form>
        </div>
        </div>  
	

</body>

</html>