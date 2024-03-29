//retrive data from database and display it on console
package jdbc;

import java.sql.*;

public class Demo_2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            System.out.println("Student table data");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging
        }
    }
}
