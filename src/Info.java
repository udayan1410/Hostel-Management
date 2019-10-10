import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Info implements ActionListener {

	String d,m,y;
	JFrame f1;
	JPanel p1,p2,p3;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3;
	
	
	
	Info()
	{
		
	
		f1 = new JFrame("Welcome");
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f1.setLayout(null);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\bg.jpg");
	    ImageIcon img1 = new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\nbnbg.png");
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 1400, 200);
		p1.setBackground(Color.white);
	
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(520, 220, 300, 320);
		p2.setBackground(new Color(152, 206, 234));
		
		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(0, 200, 1400, 600);
		//p3.setBackground(Color.black);
		p3.setBackground(new Color(152, 206, 234));
		
		l2 = new JLabel("");
		l2.setIcon(img);
		l2.setBounds(280,0,1800,200);
	 
		l3=new JLabel("");
		l3.setIcon(img1);
		l3.setBounds(1100,0,200,200);
		
		
		
		b1 = new JButton("New User");
		b1.setBounds(75,50,150,30);
		b1.addActionListener(this);
		b1.setFont(new Font("Cooper Black",Font.BOLD,15));
		
		b2 = new JButton("Existing User");
		b2.setBounds(75,100,150,30);
		b2.addActionListener(this);
		b2.setFont(new Font("Cooper Black",Font.BOLD,15));

		

		b3 = new JButton("Night Out");
		b3.setBounds(75,150,150,30);
		b3.addActionListener(this);
		b3.setFont(new Font("Cooper Black",Font.BOLD,15));
		b5=new JButton("Logout");
		b5.setBounds(100,200,100,30);
		b5.addActionListener(this);
		b5.setFont(new Font("Cooper Black",Font.BOLD,15));
		
		p2.add(b1);
		f1.add(p1);
		p1.add(l2);
		p1.add(l3);
		
		p2.add(b2);
		p2.add(b3);
		
		
		
		p2.add(b5);
		f1.add(p2);
		f1.add(p3);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== b1)
		{
			f1.setVisible(false);
			new New_user();
		}
		
		if(ae.getSource()== b2)
		{
			f1.dispose();
			new Existing();
		}
		if(ae.getSource()==b3)
		{
			f1.dispose();
			new nightout();
		}
		if(ae.getSource()==b5)
		{
			f1.dispose();
			new Login();
		}
		
		
		
	}
	
	public static void main(String args[])
	{
		new Info();
	}
}
