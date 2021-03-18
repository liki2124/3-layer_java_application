<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightblue;text-align:center">
<br>
<h2 style="text-align:center;">List Of Colleges</h2>
	<table class="table-danger" style=" margin:auto;margin-top:2cm;" border="1" >

		<th>Sr No</th>
		<th>Id</th>
		<th>Name</th>
		<th>category</th>
		<th>Location</th>
		<th>Rating</th>
		

		<c:forEach var="emp" items="${college}" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.category}</td>
				<td>${emp.location}</td>
				<td>${emp.rating}</td>

			</tr>
		</c:forEach>
	</table><br>
	<a href="/" class="text-success">Click here to return Home</a>
</body>
</html>