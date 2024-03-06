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
String s1 =(String)session.getAttribute("nm");
%>
<h1>Welcome<%=s1 %>></h1>
<a href="hello.jsp">Go</a>
</body>
</html>