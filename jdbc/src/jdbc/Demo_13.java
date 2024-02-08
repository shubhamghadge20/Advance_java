//create procedure which accept id and return name as output
package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_13 {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
	           
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter ID");
	            int rno = sc.nextInt();
	            
	            CallableStatement cst = con.prepareCall("{call disp_name(?,?)}");
	            cst.setInt(1,rno);
	            cst.registerOutParameter(2, java.sql.Types.VARCHAR); 
	            cst.executeQuery();
	            System.out.println("Name ="+cst.getString(2));
	            con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
