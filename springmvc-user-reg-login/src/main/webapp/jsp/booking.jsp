<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Booking</title>
</head>
<body>
	<h1>Room Booking</h1>
	<form:form action="/user/home" method="get" modelAttribute="bookingDetails">
	<label >Customer Id</label><form:input  type="number" path="CustomerId" value="${cid}" readonly="true"/><br>
	<label >Email Id</label><form:input  type="number" path="customerEmailId" value="${eid}" readonly="true"/><br>
	<label id="label-1">Room Type</label><form:select name="type" id="type" path="roomType"
					required="required">
					<option value="">Please Select an option</option>
					<option value="AC">AC</option>
					<option value="Non AC">Non AC</option>
					
				</form:select><br>
	<label id="label-2">Number of persons</label><form:input  type="number" path="noOfPersons"/><br>
	<label id="label-3">From date</label><form:input placeholder="dd/mm/yyyy" type="date" path="fromDate"/><br>
	<label id="label-4">To date</label><form:input placeholder="dd/mm/yyyy" type="date" path="toDate"/><br>
		
	<input type="submit" value="Register">
</form:form>
</body>
</html>