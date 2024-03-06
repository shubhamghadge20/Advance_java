<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
    <c:set var="no" value="150"></c:set>
    <c:choose>
        <c:when test="${no >= 0 && no < 100}">
            <c:out value="${no } is two digit"></c:out>
        </c:when>

        <c:when test="${no > 100}">
            <c:out value="${no } is multi digit"></c:out>
        </c:when>
    </c:choose>
</h2>
</body>
</html>
