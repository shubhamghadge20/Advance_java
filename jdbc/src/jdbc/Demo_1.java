//simple connection
package jdbc;

import java.sql.*;

public class Demo_1 {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "root", "Satara@123");
        System.out.println("Connection Created.....");
    }

}
