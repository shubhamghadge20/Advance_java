//create function for addition of two no 
package jdbc;

import java.sql.*;
import java.util.*;

public class Demo_14 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 no");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            CallableStatement cst = con.prepareCall("{ ? = call addnum(?, ?) }");
            cst.registerOutParameter(1, java.sql.Types.INTEGER);
            cst.setInt(2, n1);
            cst.setInt(3, n2);
            cst.execute();
            System.out.println("Addition: " + cst.getInt(1));
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
