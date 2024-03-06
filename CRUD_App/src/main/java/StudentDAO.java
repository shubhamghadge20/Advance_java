import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false", "root", "Satara@123");
        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }

    public static int SaveStud(Student s) {
        int res = 0;
        try { 
        	Connection connection = getConnection();
             PreparedStatement pst = connection.prepareStatement("insert into stud values(?,?,?)"); 

            pst.setInt(1, s.getRollno());
            pst.setString(2, s.getName());
            pst.setString(3, s.getCity());

            res = pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }
    
    public static List<Student> showStud() {
        List<Student> list = new ArrayList<Student>();
        try {
            con = StudentDAO.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from stud");
            
            while (rs.next()) {
                Student s = new Student();
                s.setRollno(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setCity(rs.getString(3));
                
                // Add the Student object to the list
                list.add(s);
            }
            
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static int DelStud(int rno)
	{	
		int res=0;
		try
		{
			con=StudentDAO.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from stud where rollno=?");
			pst.setInt(1, rno);
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return res;
	}
	
	public static int UpdateStud(Student s)
	{
		int res=0;
		try
		{
			con=StudentDAO.getConnection();
			PreparedStatement pst=con.prepareStatement("update stud set name=?,city=? where rollno=?");
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setInt(3, s.getRollno());
			res=pst.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return res;
	}
	
}
