//metadata interface and their method date 9/2/24
package jdbc;

import java.sql.*;


public class Demo_16 {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
	           
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery("select * from student");
	            ResultSetMetaData rsmd = rs.getMetaData();
	            int count = rsmd.getColumnCount();
	            System.out.println("Total no of column"+count);
	            
	            for(int i = 1; i<=count; i++) {
	            	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
	            	rs.close();
	            	con.close();
	            }
			
		}catch(Exception e) {
		 e.printStackTrace();	
		}

	}

}
