package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_7 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id");
			int Id =sc.nextInt();
			
			System.out.println("Enter Name");
			String Name = sc.next();
			
			System.out.println("Enter marks");
			int Marks  = sc.nextInt();
            PreparedStatement pst = con.prepareStatement("insert into student(Id,Name,Marks) values(?,?,?)");
            pst.setInt(1, Id);
            pst.setString(2,Name);
            pst.setInt(3, Marks);
            pst.executeUpdate();
            System.out.println("Record inserted");
            con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
//add value to the table through the input from user