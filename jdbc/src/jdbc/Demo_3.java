package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
			Statement st = con.createStatement();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter name");
			String nm = sc.next();
			ResultSet rs = st.executeQuery("select * from student where Name = '"+nm+"'");
			if(rs.next()){
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
				
			}else{
				System.out.print("record not found");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	  }

	}
// retrive specific record from table

