// auto commit use 9/2/24
package jdbc;

import java.sql.*;
import java.util.*;


public class Demo_18 {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
	        
	        con.setAutoCommit(false);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id , name,marks,city");
			int id = sc.nextInt();
			String name = sc.next();
			int mark = sc.nextInt();
			String City = sc.next();
			PreparedStatement pst =con.prepareStatement("insert into student values (?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, mark);
			pst.setString(4, City);
			pst.executeUpdate();
			con.commit();
			System.out.println("Record inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
