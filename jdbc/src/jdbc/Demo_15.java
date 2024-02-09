//find out avg of marks using function but not run
package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_15 {

    public static void main(String[] args) {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");

           
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter city ");

         
            String city = sc.next();

      
            CallableStatement cst = con.prepareCall("{? call findavg(?)}");
            cst.registerOutParameter(1, Types.INTEGER);
            cst.setString(2, city);
            cst.execute();

           
            System.out.println("Average = " + cst.getInt(1));

          
            con.close();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}
