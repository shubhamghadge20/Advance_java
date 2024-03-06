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
response.sendRedirect("http://www.google.com/search?="+s1);
%>
</body>
</html>