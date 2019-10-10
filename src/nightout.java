import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 class nightout implements ActionListener {
	 
	 JPanel p1,p2;
	 JFrame f1;
	 JButton b1,b2,b3;
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	 Color c2;
	 JTextField t1,t2,t3;
	 Connection con;
	 Statement st;
	 String str;
	 ResultSet rs;
	 nightout()
	 {
		 try
		 {
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_info","root","root");
			st = con.createStatement();
			
		 f1 = new JFrame("NightOut");
		 f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 f1.setLayout(null);
		 
		 
		 p1=new JPanel();
		 p1.setLayout(null);
		 p1.setBounds(0, 0, 900, 900);
		 p1.setBackground(Color.white);
		 
		 l1=new JLabel("");
		 l1.setBounds(10,10,800,900);
		 ImageIcon img=new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\nbn.jpg");
		 l1.setIcon(img);
		 
		 p1.add(l1);
		 f1.add(p1);
		 
		 l2 = new JLabel("NightOut");
		 l2.setBounds(175,60,200,40);
		 l2.setFont(new Font("Cooper Black",Font.BOLD,35));
		 
		 
		 l3 = new JLabel("Name:");
		 l3.setBounds(150,220,200,30);
		 l3.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l4 = new JLabel("Id:");
		 l4.setBounds(150,170,200,30);
		 l4.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 t1 = new JTextField(20);
		 t1.setBounds(250,170,100,30);
		 
		 t2 = new JTextField(20);
		 t2.setBounds(250,220,100,30);
		 
		 b1 = new JButton("Show");
		 b1.setBounds(100,300,100,30);
	
		 b2 = new JButton("Add");
		 b2.setBounds(300,300,100,30);

		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		 l5 = new JLabel("");
		 l5.setBounds(75,400,70,30);
		 l5.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l6 = new JLabel("");
		 l6.setBounds(75,440,70,30);
		 l6.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l7 = new JLabel("");
		 l7.setBounds(75,480,200,30);
		 l7.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l8 = new JLabel("");
		 l8.setBounds(300,400,70,30);
		 l8.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l9 = new JLabel("");
		 l9.setBounds(300,440,100,30);
		 l9.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l10 = new JLabel("");
		 l10.setBounds(300,480,200,30);
		 l10.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 l11 = new JLabel("");
		 l11.setBounds(200,540,300,30);
		 l11.setFont(new Font("Calibri",Font.BOLD,20));
		 
		 b3 = new JButton("Exit");
		 b3.setBounds(200,590,100,30);
		 b3.addActionListener(this);
		 
		 
		 p2=new JPanel();
		 p2.setLayout(null);
		 p2.setBounds(900, 0, 550, 900);
		 p2.setBackground(new Color(152, 206, 234));
		 
		 
		 p2.add(l2);
		 p2.add(l3);
		 p2.add(t1);
		 p2.add(t2);
		 p2.add(b1);
		 p2.add(b2);
		 p2.add(l4);
		 p2.add(l5);
		 p2.add(l6);
		 p2.add(l7);
		 p2.add(l8);
		 p2.add(l9);
		 p2.add(l10);
		 p2.add(l11);
		 p2.add(b3);
		 f1.add(p2);
		 f1.setVisible(true);
		 }catch(Exception e){
			 
		 }
	 }
	 
	 public void actionPerformed(ActionEvent ae)
	 {
		 if(ae.getSource()==b1)
		 {
			 l5.setText("Id :");
			 l6.setText("Name :");
			 l7.setText("Nightouts Available :");
			 
			 try
			 {
				 str="Select id,name,night_out from student_info where id="+t1.getText();
				 rs=st.executeQuery(str);
				 
				 while(rs.next())
				 {
					 l8.setText(rs.getString(1));
					 l9.setText(rs.getString(2));
					 l10.setText(rs.getString(3));
					 
				 }
				 
			 }catch(Exception e){
				 
				 
			 }
		 }
		 
		 if(ae.getSource()==b2)
		 {
			 try{
			 str="Select id,name,night_out from student_info where id="+t1.getText();
			 rs=st.executeQuery(str);
			 
			 while(rs.next())
			 {
				int i = Integer.parseInt((rs.getString(3)));
				System.out.println(i);
					if(i==0)
					{
						 l8.setText(rs.getString(1));
						 l9.setText(rs.getString(2));
						 l10.setText(rs.getString(3));
						 l11.setText("Limit Reached!");
					}
		 	
					else if(i>0)
					{
						i=i-1;
						System.out.println(i);
						String str2 = "update student_info set night_out="+i+" where id='"+t1.getText()+"'";
						System.out.println(str2);
						st.executeUpdate(str2);
						
						 l5.setText("Id :");
						 l6.setText("Name :");
						 l7.setText("Nightouts Available :");
						
						str="Select id,name,night_out from student_info where id="+t1.getText();
						 rs=st.executeQuery(str);
						 
						 while(rs.next())
						 {
							 l8.setText(rs.getString(1));
							 l9.setText(rs.getString(2));
							 l10.setText(rs.getString(3));
							 
						 }
						 l11.setText("Added Succesfully");
					}
			 }
		}
			 
			 catch(Exception e){System.out.println(e);}
		 }
		 
		 if(ae.getSource() == b3)
		 {
			 f1.setVisible(false);
			 new Info();
			 
		 }
		 
	 }
	 
	 public static void main(String args[])
	 {
		 new nightout();
	 }

	 
}
