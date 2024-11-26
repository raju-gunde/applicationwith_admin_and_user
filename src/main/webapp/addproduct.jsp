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
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("this page is belongs to....."+ab.getAname()+"<br>");
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<a href="product.html">AddProductr</a>
<a href="view">ViewAllProducts</a>
<a href="logout">LogOun</a>
</body>
</html>