<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table,tr,th,td{
border:1px solid black;
margin:auto;
}
</style>
</head>
<body>
	<p>${list}</p>
	<table>
		<tr>
			<th>Donor Name</th>
			<th>Blood Group</th>
			<th>Date Last Donated</th>
			<th>Mobile Number</th>
		</tr>
		<c:forEach items="${list}" var="eachItem">
		<tr>
			<td>${eachItem.firstName}</td>
			<td>${eachItem.bloodGroup}</td>
			<td>${eachItem.dateLastDonated}</td>
			<td>${eachItem.mobileNumber}</td>
		</tr>
		</c:forEach>
	</table>
	
<a href="/">Home</a>
</body>
</html>