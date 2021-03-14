<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>

</head>
<body>

	 
	<div align="center">
	 <h4> <strong>LOGIN PAGE</strong></h4>
	 
	 <form action="LoginServlet" method="post">
	 <Label>USER ID:</Label><input type="text" name= "userid"> <br/>
	 <br/>
	 <Label>PASSWORD:</Label><input type="password" name= "pwd"> <br/>
	 <br/>	 
	 <input type="submit" value="LOGIN"> 	 
	 </form>
	 </div>

</html>