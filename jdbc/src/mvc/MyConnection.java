package mvc;
import java.sql.*;
public class MyConnection {
	Connection con=null;
	public void getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false","root","Satara@123");
		      
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}