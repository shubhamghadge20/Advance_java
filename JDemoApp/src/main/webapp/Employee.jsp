<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="obj" class="mypack.Employee"></jsp:useBean>
<jsp:setProperty property="empid" name="obj" value="101"/>
<jsp:setProperty property="ename" name="obj" value="Raj"/>
<jsp:setProperty property="salary" name="obj" value="3000"/>
<body>
<h2>EmpId</h2><jsp:getProperty property="empid" name="obj" />
<h2>EmpName</h2><jsp:getProperty property="ename" name="obj" />
<h2>Salary</h2><jsp:getProperty property="salary" name="obj" />
</body>
</html>