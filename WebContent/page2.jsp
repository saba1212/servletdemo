<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PAGE 2</title>
</head>
<body>
<%
String msg= (String)session.getAttribute("MESSAGE");
String user= (String)session.getAttribute("USERID");
%>

<p><%=msg %></p>
<p> Hello <%=user %></p>



<a href="LoginServlet?ACTION=logout"> LOG OUT</a>
</body>
</html>