//about database meta data and its method  9/2/24
package jdbc;

import java.sql.*;



public class Demo_17 {

	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");

          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
         
          DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
          System.out.println("Driver Name"+ dm.getDriverName());
          System.out.println("Driver version"+ dm.getDriverVersion());
          System.out.println("User name"+dm.getUserName());
          System.out.println("Database name"+ dm.getDatabaseProductName());
          System.out.println("Database version"+ dm.getDatabaseProductVersion());
          String tb[] = {"TABLE"};
          ResultSet rs =dm.getTables(null, null, "%", tb);
          
          while(rs.next()) {
        	  System.out.println(rs.getString(3));
          }
          rs.close();
          con.close();
      }catch(Exception e) {
    	 e.printStackTrace();  
      }

	}

}
