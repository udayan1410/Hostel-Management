import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class New_user implements ActionListener {
	
	JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	Connection con;
	String fname;
	Statement st;
	int len,j;
	char a,b;
	StringBuffer sb;
	String fname2;
	ImageIcon img2;
	
	New_user()
	{
		try{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_info","root","root");
		st = con.createStatement();
		
		img2 = new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\blank.JPG");
		
		
		
	   f1=new JFrame("Student Details");
	   f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
	   f1.setLayout(null);
	   f1.getContentPane().setBackground(new Color(152, 206, 234));
	   
	   l1=new JLabel("Enter Details");
	   l1.setBounds(555,60,500,40);
	   l1.setFont(new Font("Cooper Black",Font.BOLD,40));
	   
	   l2=new JLabel("ID:");
	   l2.setBounds(180,200,150,30);
	   l2.setFont(new Font("Cooper Black",Font.PLAIN,20));
	 
	   l3=new JLabel("Name:");
	   l3.setBounds(180,260,150,30);
	   l3.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l4=new JLabel("Student's Contact:");
	   l4.setBounds(180,320,250,30);
	   l4.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l5=new JLabel("Father's  Contact:");
	   l5.setBounds(180,380,250,30);
	   l5.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l6=new JLabel("Mother's Contact:");
	   l6.setBounds(180,440,250,30);
	   l6.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l7=new JLabel("DOB:");
	   l7.setBounds(180,500,150,30);
	   l7.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l8=new JLabel("Email:");
	   l8.setBounds(180,560,150,30);
	   l8.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l9=new JLabel("Parent's Email:");
	   l9.setBounds(780,200,300,30);
	   l9.setFont(new Font("Cooper Black",Font.PLAIN,20));
	
	   l10=new JLabel("Admission Year:");
	   l10.setBounds(780,260,300,30);
	   l10.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l11=new JLabel("Hostel:");
	   l11.setBounds(780,320,300,30);
	   l11.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l12=new JLabel("Room No:");
	   l12.setBounds(780,380,300,30);
	   l12.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l13=new JLabel("Course:");
	   l13.setBounds(780,440,300,30);
	   l13.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l14=new JLabel("Branch:");
	   l14.setBounds(780,500,150,30);
	   l14.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l15=new JLabel("Year:");
	   l15.setBounds(780,560,150,30);
	   l15.setFont(new Font("Cooper Black",Font.PLAIN,20));
	   
	   l16=new JLabel("");
	   l16.setBounds(550,650,300,30);
	   l16.setFont(new Font("Cooper Black",Font.PLAIN,15));
	   l16.setForeground(Color.BLUE);
	   
	   l17=new JLabel(img2);
	   l17.setBounds(1150,30,200,200);
	
	   fname = "C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\blank.JPG";
	   
	   t1=new JTextField(20);
	   t1.setBounds(370,200,150,30);
	   
	   t2=new JTextField(20);
	   t2.setBounds(370,260,150,30);
	   
	   t3=new JTextField(20);
	   t3.setBounds(370,320,150,30);
	   
	   t4=new JTextField(20);
	   t4.setBounds(370,380,150,30);
	   
	   t5=new JTextField(20);
	   t5.setBounds(370,440,150,30);
	   
	   t6=new JTextField(20);
	   t6.setBounds(370,500,150,30);
	   
	   t7=new JTextField(20);
	   t7.setBounds(370,560,150,30);
	   
	   t8=new JTextField(20);
	   t8.setBounds(950,200,150,30);
	   
	   t9=new JTextField(20);
	   t9.setBounds(950,260,150,30);
	   
	   t10=new JTextField(20);
	   t10.setBounds(950,320,150,30);
	   
	   t11=new JTextField(20);
	   t11.setBounds(950,380,150,30);
	   
	   t12=new JTextField(20);
	   t12.setBounds(950,440,150,30);
	   
	   t13=new JTextField(20);
	   t13.setBounds(950,500,150,30);
	   
	   t14=new JTextField(20);
	   t14.setBounds(950,560,150,30);
	   
	   b1 = new JButton("Submit");
	   b1.setBounds(580,600,150,35);
	   b1.addActionListener(this);
	   b1.setFont(new Font("Cooper Black",Font.BOLD,15));
	   
	   
	   b2 = new JButton("Add Photo");
	   b2.setBounds(950,60,150,35);
	   b2.addActionListener(this);
	   b2.setFont(new Font("Cooper Black",Font.BOLD,15));   
	   

	   b3 = new JButton("Back");
	   b3.setBounds(10,10,100,30);
	   b2.setFont(new Font("Cooper Black",Font.BOLD,15));
	   
	   b3.addActionListener(this);
	   b3.setFont(new Font("Cooper Black",Font.BOLD,15));
	   
	   b4 = new JButton("New User");
	   b4.setBounds(250,60,150,35);
	   b4.addActionListener(this);
	   b4.setFont(new Font("Cooper Black",Font.BOLD,15));
	   
	   f1.add(l1);
	   f1.add(l2);
	   f1.add(l3);
	   f1.add(l4);
	   f1.add(l5);
	   f1.add(l6);
	   f1.add(l7);
	   f1.add(l8);
	   f1.add(t1);
	   f1.add(t2);
	   f1.add(t3);
	   f1.add(t4);
	   f1.add(t5);
	   f1.add(t6);
	   f1.add(t7);
	   f1.add(l9);
	   f1.add(l10);
	   f1.add(l11);
	   f1.add(l12);
	   f1.add(l13);
	   f1.add(l14);
	   f1.add(l15);
	   f1.add(t8);
	   f1.add(t9);
	   f1.add(t10);
	   f1.add(t11);
	   f1.add(t12);
	   f1.add(t13);
	   f1.add(t14);
	   f1.add(l16);
	   f1.add(l17);
	   f1.add(b1);
	   f1.add(b2);
	   f1.add(b3);
	   f1.add(b4);
	   f1.setVisible(true);
	   }
		catch(Exception e){}
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == b1)
		{
			String str = "insert into student_info values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+t11.getText()+"','"+t12.getText()+"','"+t13.getText()+"','"+t14.getText()+"','2','"+fname2+"')";
		
			System.out.println(str);
			
			l16.setText("Data Added Succesfully");
			l17.setText("Photo Successfully Added");
			
			try{
			st.executeUpdate(str);}
			catch(Exception e){System.out.println(""+e);}
		}
		
		if(ae.getSource() == b2)
		{
			FileDialog fd = new FileDialog(f1,"Select Photo",FileDialog.LOAD);
			fd.setVisible(true);
			fname = fd.getDirectory()+fd.getFile();
			ImageIcon img = new ImageIcon(fname);
			
			len = fname.length();
		    
			
			sb = new StringBuffer();
			
			for(int i=0;i<len;i++)
			{
				a = fname.charAt(i);
				if(a == 92)
				{
					sb.append(a);
				}
				sb.append(a);
				
			}
			System.out.println(fname);
			fname2 = sb.toString();
			
			l17.setIcon(img);	
		}
		if(ae.getSource() == b3)
		{
			f1.dispose();
			new Info();
			
		}
		
		if(ae.getSource() == b4)
		{

			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t12.setText("");
			t13.setText("");
			t14.setText("");	
			l16.setText("");
			l17.setIcon(img2);
			
		}
		
	}
	
	public static void main(String args[])
	{
		
		new New_user();
	}
	
}
