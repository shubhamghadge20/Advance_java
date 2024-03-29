//write a procedure to update name and marks using id not run
package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Demo_12 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Id, Name, and Marks");
            int id = sc.nextInt();
            String nm = sc.next();
            int mk = sc.nextInt();

            CallableStatement cst = con.prepareCall("{call proc_stud6(?,?,?)}");
            cst.setInt(1, id);
            cst.setString(2, nm);
            cst.setInt(3, mk);

            int res =cst.executeUpdate();
			if(res==1)
				System.out.println("Record Updated");
			else
				System.out.println("sorry");
			con.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
