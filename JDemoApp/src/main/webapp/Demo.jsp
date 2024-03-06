<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="d" class="mypack.Demo"></jsp:useBean>
<body>
<%
int sq =d.square(5);
int ans=d.addition(3,4);
%>
<h2>Square=<%=sq %></h2>
<h2>Addition=<%=ans %></h2>
</body>
</html>