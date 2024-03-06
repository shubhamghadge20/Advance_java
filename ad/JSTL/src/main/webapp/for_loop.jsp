<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10">
    <c:out value="${i}"></c:out>
</c:forEach>

<c:forEach var="i" begin="1" end="10" step="2">
    <c:out value="${i}"></c:out>
</c:forEach>

<c:redirect url="https://www.google.com/"></c:redirect>
</body>
</html>
