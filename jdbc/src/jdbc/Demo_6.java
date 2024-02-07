package jdbc;

import java.sql.Connection;
import java.sql.*;

public class Demo_6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
			int Id =4;
			String Name = "Raj";
			int Marks  = 78;
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
//insert values into table
