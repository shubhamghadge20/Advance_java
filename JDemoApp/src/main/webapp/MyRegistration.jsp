<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.sql.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s3 =request.getParameter("a1");
String s4 =request.getParameter("a2");
String s5 =request.getParameter("a3");
String s6 =request.getParameter("a4");
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
    PreparedStatement pst = con.prepareStatement("insert into userinfo values(?,?,?,?)");
    pst.setString(1,s3);
    pst.setString(2,s4);
    pst.setString(3, s5);
    pst.setString(4, s6);
     pst.executeUpdate();;
   out.println("Registration Successfully");
}catch (Exception e){
	
}
%>
</body>
</html>