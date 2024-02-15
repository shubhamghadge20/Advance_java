package mvc;

import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudFrm extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3;
	Container d;
	Connection con;
	ResultSet rs;
  StudFrm(){
	   d =getContentPane();
	   setLayout(new FlowLayout());
	   
	   l1=new JLabel("Rollno");
		 l2=new JLabel("Name");
		 l3=new JLabel("City");
		 
		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 t3=new JTextField(10);
		 
		 b1=new JButton("First");
		 b2=new JButton("Next");
		 b3=new JButton("Previous");
		 b4=new JButton("Last");
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 		 
		 d.add(l1);d.add(t1);d.add(l2);d.add(t2);
		 d.add(l3);d.add(t3);
		 d.add(b1);d.add(b2);d.add(b3);d.add(b4);
		 setSize(500,500);
		 setVisible(true);
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
				 con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/info?autoReconnect=true&useSSL=false","root","Satara@123");
				 Statement st =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				 rs=st.executeQuery("select * from Stud");
				// display();
				 
		  }catch(Exception e){
			  e.printStackTrace();
		  }
  }
  
  public void display()
	{
		try
		{
			t1.setText(String.valueOf(rs.getInt(1)));
			t2.setText(rs.getString(2));
			t3.setText(rs.getString(3));
		}
		catch(Exception ex) {ex.printStackTrace();}
		
	}
	public static void main(String[] args) {
		new StudFrm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b1)
		{
			try
			{
				if(!rs.isFirst())
				{
					rs.first();
					display();
				}
			}
			catch(Exception ex) 
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			try
			{
				if(rs.next())
					display();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			try
			{
					if(rs.previous())
						display();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();	
			}
		}
		else if(e.getSource()==b4)
		{
			try
			{
				if(!rs.isLast())
				{
					rs.last();
					display();
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}