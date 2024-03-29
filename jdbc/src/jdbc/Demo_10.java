 //using procedure insert data
package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Demo_10 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Id, Name, and Marks");
            int Id = sc.nextInt();
            String Name = sc.next();
            int Marks = sc.nextInt();

            CallableStatement cst = con.prepareCall("{call proc_stud1(?,?,?)}");
            cst.setInt(1, Id);
            cst.setString(2, Name);
            cst.setInt(3, Marks);

            cst.execute();
            System.out.println("Record inserted");
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging purposes
        }
    }
}
