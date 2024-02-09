//update query in java
package jdbc;
import java.sql.*;
import java.util.*;

public class Demo_8 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
			int id;
			String nm;
			int mk;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id ,name,marks");
			id = sc.nextInt();
			nm =sc.next();
			mk =sc.nextInt();
			
			PreparedStatement pst = con.prepareStatement("update student set Name=? ,Marks=? where id =?");
			pst.setString(1, nm);
			pst.setInt(2, mk);
			pst.setInt(3, id);
			int res =pst.executeUpdate();
			if(res==1)
				System.out.println("Record Updated");
			else
				System.out.println("sorry");
			con.close();
		}catch(Exception e){
			
			
		}

	}

}
