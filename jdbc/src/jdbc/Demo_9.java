//delete query using java
package jdbc;

import java.sql.Connection;
import java.sql.*;
import java.util.*;

public class Demo_9 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
		int id;
		String nm;
		int mk;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id ");
		id = sc.nextInt();
		
		PreparedStatement pst = con.prepareStatement("delete from student where id=?");

		pst.setInt(1, id);
		int res =pst.executeUpdate();
		if(res==1)
			System.out.println("Record deleted");
		else
			System.out.println("sorry");
		con.close();
	}
	catch(Exception e){
		
		
	}

	}
}

