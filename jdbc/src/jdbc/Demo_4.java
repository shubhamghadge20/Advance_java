//retrive specific record from table using prepared statement
package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String nm = sc.next();
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM student WHERE Name = ?");
            pst.setString(1, nm);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
            	System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
            }else {
            	System.out.println("Record not found");
            }
            rs.close();
            con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
