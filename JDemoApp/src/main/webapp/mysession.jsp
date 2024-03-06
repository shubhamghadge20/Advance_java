<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
<%
String s1 = request.getParameter("t1");
session.setAttribute("nm",s1);
%>
<h2>Session Created</h2>
<a href ="mysession1.jsp">Go</a>
</body>
</html>