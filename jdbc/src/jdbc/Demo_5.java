//create table
package jdbc;
import java.sql.*;
public class Demo_5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");

			Statement st = con.createStatement();
			st.execute("CREATE TABLE test(id INT, name VARCHAR(20))");

			System.out.println("Table created...");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}


