//call procedure for show table
package jdbc;

import java.sql.*;


public class Demo_11 {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
	            CallableStatement cst = con.prepareCall("{call proc_stud4()}");
	            
	            ResultSet rs=cst.executeQuery();
	            while(rs.next())
	            {
	            	System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
	            }
	            rs.close();
	            con.close();
	           
		}catch(Exception e) {
			  e.printStackTrace();
		}

	}

}
