<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    String s1 = request.getParameter("t1");
    String s2 = request.getParameter("t2");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM userinfo WHERE username=? AND password=?");
        pst.setString(1, s1);
        pst.setString(2, s2);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
%>
            <h1>Welcome <%= s1 %></h1>
<%
        } else {
%>
            <h1>Login Failed</h1>
<%
        }
        rs.close();
        con.close();
        out.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>
