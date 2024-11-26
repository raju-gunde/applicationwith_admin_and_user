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
Customebean ab=(Customebean)session.getAttribute("cbean");
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
		+"<a href='bye?pcode="+pb.getCode()+"'>ByeProduct</a>"+"<br>");
		
		
	}
	 
}

%>
</body>
</html>