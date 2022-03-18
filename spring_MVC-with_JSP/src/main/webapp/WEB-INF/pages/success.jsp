<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table,tr,th{
border:1px solid black;
margin:auto;
}
</style>
</head>
<body>
<h2 style="text-align:center">List of Blood Donor</h2>
<table>
<tr>
<th>First Name</th>
<th>Blood Group</th>
<th>Mobile Number</th>
<th>Date Last Donated</th>
</tr>
<tr>
<th>${command.firstName}</th>
<th>${command.bloodGroup}</th>
<th>${command.mobileNumber}</th>
<th>${command.dateLastDonated}</th>
</table>

<a href="/">Home</a>
</body>
</html>