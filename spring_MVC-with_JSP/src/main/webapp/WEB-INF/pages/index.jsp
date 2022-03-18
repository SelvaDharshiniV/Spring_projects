<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" type="img/png" href="/images/logo.jpg">
<style type="text/css">
ul>li{
display:inline;
margin:10px;
border: 1px solid #0000FF;
}
img{
display:block;
margin:auto;
}
</style>
</head>
<body>
<div>
<img alt="" src="/images/BD.png">
</div>
<h1 style="text-align:center">${heading}</h1>
<ul>
<li><a href="add">Add Donor</a></li>
<li><a href="findAll">Find All DoNOR</a></li>
<li><a href="srcByGroup">Search by Blood group</a></li>
<li><a href=findName>Find by First Name</a></li>
</ul>
</body>
</html>