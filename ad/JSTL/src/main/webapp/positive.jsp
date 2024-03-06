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
<c:set var="no" value="-10"></c:set>
<h2>
<c:if test ="${no>0 }">
<c:out value ="${no } is positive"></c:out>
</c:if>

<c:if test ="${no<0 }">
<c:out value ="${no }is negative"></c:out>
</c:if>

</h2>

</body>
</html>