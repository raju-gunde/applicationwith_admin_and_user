<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<ProducTBean> al=(ArrayList<ProducTBean>)session.getAttribute("al");
out.println("this page is belongs to ........"+ab.getFname()+"<br>");
if(al.size()==0){
	out.println("product is not available....<br>");
	
	
}
else{
	Iterator<ProducTBean> it=al.iterator();
	while(it.hasNext()){
		ProducTBean pb=(ProducTBean)it.next();
		out.println(pb.getCode()+"&nbsp&nbsp <br>"+pb.getName()+"&nbsp&nbsp <br>"+pb.getPrice()+"&nbsp&nbsp <br>"+pb.getQty()+"&nbsp&nbsp <br>"
		+"<a href='edit?pcode="+pb.getCode()+"'>Edit</a>"+"&nbsp&nbsp"+"<a href='delete?pcode="+pb.getCode()+"'>Delete</a>"+"&nbsp&nbsp <br>");
		
		
	}
	 
}

%>
<a href="Product.html">AddProduct</a>

</body>
</html>