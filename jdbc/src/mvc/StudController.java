package mvc;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.awt.*;

public class StudController implements ActionListener {

	StudModel m;
	Student s1;
	StudView v;
	public StudController(StudView v)
	{
		s1=new Student();
		m=new StudModel();
		this.v=v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==v.b1)
		{
			if(v.t1.getText().isEmpty() || v.t2.getText().isEmpty() || v.t3.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Please enter record ");
			}
			else
			{
			s1.setRollno(Integer.parseInt(v.t1.getText()));
			s1.setName(v.t2.getText());
			s1.setCity(v.t3.getText());
			m.addRec(s1);
			}
		}
		else if(e.getSource()==v.b2)
		{
			s1.setRollno(Integer.parseInt(v.t1.getText()));
			s1.setName(v.t2.getText());
			s1.setCity(v.t3.getText());
			m.updateRec(s1);
		}
		else if(e.getSource()==v.b3)
		{
			s1.setRollno(Integer.parseInt(v.t1.getText()));
			m.delRec(s1);
		}
		else if(e.getSource()==v.b4)
		{
			s1.setRollno(Integer.parseInt(v.t1.getText()));
			m.searchRec(s1);
			v.t2.setText(s1.getName());
			v.t3.setText(s1.getCity());
		}
		else if(e.getSource()==v.b5)
		{
			v.t1.setText("");
			v.t2.setText("");
			v.t3.setText("");
		}
}
	
}