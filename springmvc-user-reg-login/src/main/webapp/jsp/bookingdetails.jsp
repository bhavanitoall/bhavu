<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>UserHome</title>
</head>
<body>
	<h1>Rooms booked by customers!</h1>
	<table >
				<thead>
					<tr>
						
						<th>Customer Id</th>
						<th>Customer Email Id</th>
						<th>Room type</th>
						<th>Number of persons</th>
						<th>From date</th>
						<th>To date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${rooms}" var="room">
						<tr>
							
							<td>${room.customerId}</td>
							<td>${room.customerEmailId}</td>
							<td>${room.roomType}</td>
							<td>${room.noOfPersons}</td>
							<td>${room.fromDate}</td>
							<td>${room.toDate}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
</body>
</html>