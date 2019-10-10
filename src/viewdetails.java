import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class viewdetails {
	
	JFrame f1;
	JPanel p1,p2,p3,p4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	JButton b1,b2;
	JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	Connection con;
	String fname;
	Statement st;
	ResultSet rs;
	
	viewdetails(String pid)
	{
		try{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_info","root","root");
		st = con.createStatement();
		
		
		String str = "select * from student_info where id="+pid;
		rs = st.executeQuery(str);
		
		
		f1 = new JFrame("Details");
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f1.setLayout(null);
		f1.getContentPane().setBackground(new Color(152, 206, 234));
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(50,50,550,275);
		p1.setBackground(Color.white);
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(750,50,550,275);
		p2.setBackground(Color.white);
		
		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(750,375,550,275);
		p3.setBackground(Color.white);
		
		p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(50,375,550,275);
		p4.setBackground(Color.white);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\details.png");
		
		l1 = new JLabel("Details");
		l1.setBounds(70,40,150,40);
		l1.setFont(new Font("Calibri",Font.BOLD,35));
		
		l2 = new JLabel(img);
		l2.setBounds(70,90,100,100);
				
		
		l4 = new JLabel("ID :");
		l4.setBounds(40,25,200,20);
		l4.setFont(new Font("Calibri",Font.BOLD,20));
		
		l5 = new JLabel("Name :");
		l5.setBounds(40,65,200,20);
		l5.setFont(new Font("Calibri",Font.BOLD,20));
		
		l6 = new JLabel("Contact :");
		l6.setBounds(40,105,200,20);
		l6.setFont(new Font("Calibri",Font.BOLD,20));
		
		l7 = new JLabel("Email :");
		l7.setBounds(40,155,200,20);
		l7.setFont(new Font("Calibri",Font.BOLD,20));
		
		l8 = new JLabel("Father's Contact :");
		l8.setBounds(40,195,200,20);
		l8.setFont(new Font("Calibri",Font.BOLD,20));
		
		l14 = new JLabel("Hostel Name :");
		l14.setBounds(40,75,200,20);
		l14.setFont(new Font("Calibri",Font.BOLD,20));
		
		l15 = new JLabel("Room No :");
		l15.setBounds(40,155,200,20);
	    l15.setFont(new Font("Calibri",Font.BOLD,20));
			
		t1 = new JLabel("Branch :");
		t1.setBounds(40,55,200,20);
		t1.setFont(new Font("Calibri",Font.BOLD,20));
		
		t2 = new JLabel("Year :");
		t2.setBounds(40,105,200,20);
		t2.setFont(new Font("Calibri",Font.BOLD,20));
		
		t3 = new JLabel("Course :");
		t3.setBounds(40,155,200,20);
		t3.setFont(new Font("Calibri",Font.BOLD,20));
		
		
		
         while(rs.next())
         {
        	 ImageIcon img2 = new ImageIcon(rs.getString(16));
		l3 = new JLabel(img2);
		l3.setBounds(260, 60, 200, 200);


		l9 = new JLabel(rs.getString(1));
		l9.setBounds(260,25,200,20);
		l9.setFont(new Font("Calibri",Font.BOLD,20));
		
		l10 = new JLabel(rs.getString(2));
		l10.setBounds(260,65,200,20);
		l10.setFont(new Font("Calibri",Font.BOLD,20));
		
		l11 = new JLabel(rs.getString(3));
		l11.setBounds(260,105,200,20);
		l11.setFont(new Font("Calibri",Font.BOLD,20));
		
		l12 = new JLabel(rs.getString(7));
		l12.setBounds(260,155,200,20);
		l12.setFont(new Font("Calibri",Font.BOLD,20));
		
		l13 = new JLabel(rs.getString(4));
		l13.setBounds(260,195,200,20);
		l13.setFont(new Font("Calibri",Font.BOLD,20));
		
		t5 = new JLabel(rs.getString(11));
		t5.setBounds(260,155,200,20);
		t5.setFont(new Font("Calibri",Font.BOLD,20));
		
		t4 = new JLabel(rs.getString(10));
		t4.setBounds(260,75,200,20);
		t4.setFont(new Font("Calibri",Font.BOLD,20));
		
		t6 = new JLabel(rs.getString(13));
		t6.setBounds(200,55,200,20);
		t6.setFont(new Font("Calibri",Font.BOLD,20));
		
		t7 = new JLabel(rs.getString(14));
		t7.setBounds(200,105,200,20);
		t7.setFont(new Font("Calibri",Font.BOLD,20));
		
		t8 = new JLabel(rs.getString(12));
		t8.setBounds(200,155,200,20);
		t8.setFont(new Font("Calibri",Font.BOLD,20));
		
         }
	
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		
		
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		p2.add(l10);
		p2.add(l11);
		p2.add(l12);
		p2.add(l13);
		
		p3.add(l14);
		p3.add(l15);
		p3.add(t4);
		p3.add(t5);
		
		
		p4.add(t1);
		p4.add(t2);
		p4.add(t3);
		p4.add(t6);
		p4.add(t7);
		p4.add(t8);
		
		
		f1.add(p1);
		f1.add(p2);
		f1.add(p3);
		f1.add(p4);
		f1.setVisible(true);
	   }
		catch(Exception e){}
		}

	
}
