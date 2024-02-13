package mvc;
import javax.swing.*;
import java.awt.*;
public class StudView extends JFrame {
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5;
	Container d;
	StudView()
	{
		 d=getContentPane();
		 setLayout(new FlowLayout());
		 
		 l1=new JLabel("Rollno");
		 l2=new JLabel("Name");
		 l3=new JLabel("City");
		 
		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 t3=new JTextField(10);
		 
		 b1=new JButton("Add");
		 b2=new JButton("Update");
		 b3=new JButton("Delete");
		 b4=new JButton("Search");
		 b5=new JButton("Clear");
		 
		 b1.addActionListener(new StudController(this));
		 b2.addActionListener(new StudController(this));
		 b3.addActionListener(new StudController(this));
		 b4.addActionListener(new StudController(this));
		 b5.addActionListener(new StudController(this));
		 		 
		 d.add(l1);d.add(t1);d.add(l2);d.add(t2);
		 d.add(l3);d.add(t3);
		 d.add(b1);d.add(b2);d.add(b3);d.add(b4);d.add(b5);
		 setSize(500,500);
		 setVisible(true);
	}
}