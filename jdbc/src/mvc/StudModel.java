package mvc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class StudModel {
	MyConnection c=new MyConnection();
	public void addRec(Student s1)
	{
		try
		{
			c.getConnection();
			PreparedStatement  pst=c.con.prepareStatement
					("insert into Stud values(?,?,?)");
			pst.setInt(1,s1.getRollno());
			pst.setString(2, s1.getName());
			pst.setString(3,s1.getCity());
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"Record is saved");
			c.con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateRec(Student s1)
	{
		try
		{
			c.getConnection();
			PreparedStatement  pst=c.con.prepareStatement
					("update Stud set name=?,city=? where rollno=?");
			pst.setString(1,s1.getName());
			pst.setString(2, s1.getCity());
			pst.setInt(3, s1.getRollno());
			
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"Record is updated");
			c.con.close();
			
		}
		catch(Exception e)
		{
			
		}
	}
	public void delRec(Student s1)
	{
		try
		{
			c.getConnection();
			PreparedStatement  pst=c.con.prepareStatement
					("delete from Stud where rollno=?");
			pst.setInt(1, s1.getRollno());
			
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"Record is deleted");
			c.con.close();
			
		}
		catch(Exception e)
		{
			
		}

	}
	public void searchRec(Student s1)
	{
		try
		{
			c.getConnection();
			PreparedStatement  pst=c.con.prepareStatement
					("select * from Stud where rollno=?");
			pst.setInt(1, s1.getRollno());
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				s1.setName(rs.getString(2));
				s1.setCity(rs.getString(3));
			}
			rs.close();
			
			c.con.close();
			
		}
		catch(Exception e)
		{
			
		}

	}
	

}