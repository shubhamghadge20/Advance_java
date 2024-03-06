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
String s1 =request.getParameter("t1");
String s2 = request.getParameter("t2");

if (s1.equals("admin")&&s2.equals("admin123"))
{
%>
<jsp:forward page="welcome.jsp">
<jsp:param value="<%=s1 %>" name="username"/>	
</jsp:forward>
<% 
}
else{
%>
<h2>Login Failed</h2>
<jsp:include page ="Login2.html"></jsp:include>
<%
}
%>
</body>
</html>