<%@page import="test.ProducTBean"%>
<%@page import="test.Customebean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Customebean cb=(Customebean)session.getAttribute("cbean");
ProducTBean pb=(ProducTBean)request.getAttribute("pb");
out.println("you'r product name is:"+pb.getName()+"<br>");
out.println("you'r product price is:"+(pb.getPrice())+"<br>");

out.println("mr "+cb.getFname()+"your product will be reached whith in 3 days.......<br>");
out.println("THANK YOY YOU HAVE A GOODAY..........<br>");

%>
</body>
</html>