<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Soy welcome </title>
</head>
<body>
		<jsp:useBean id="person" class="com.ecodeup.com.Person" scope= "request"/> 
		Bienvenido, <jsp:getProperty property="name" name="person"    />
</body>
</html>