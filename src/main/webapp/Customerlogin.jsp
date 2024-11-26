<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Customebean c=(Customebean)session.getAttribute("cbean");
out.println("welcome to "+c.getFname()+"<br>");


%>
<a href="viewall">VewallProducts</a>
<a href="logout">Logout</a>

</body>
</html>