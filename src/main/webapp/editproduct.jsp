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
ProducTBean pb=(ProducTBean)request.getAttribute("pb");
 out.println("this page is belongs to ...."+ab.getFname()+"<br>");
%>
<form action="upd" method="post">
<input type="hidden" name="pcode" value=<%=pb.getCode() %>><br>
productPrice:<input type="text" name="price" value=<%=pb.getPrice() %>><br>
procuctQuantity:<input type="text" name="quantity" value=<%=pb.getQty() %>> <br>
<input type="submit" value="updateproduct">
</form>

</body>
</html>