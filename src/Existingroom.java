import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Existingroom implements ActionListener{

	DefaultTableModel model;
	JScrollPane tableContainer;
	JFrame f1;
	JTable t1;
	JButton b1,b2;
	Connection con;
	Statement st;
	ResultSet rs;
	JPanel p2;
	JLabel l1;
	JComboBox c1;
	String msg;
	JComboBox jc;
	JTextField t2;
	
	Existingroom(String room)
	{
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_info","root","root");
			st = con.createStatement();
			
		f1 = new JFrame("Existing Records");
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f1.setLayout(null);
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,1400,305);
		p1.setBackground(new Color(152, 206, 234));
	
		l1 = new JLabel("Showing Database ");
		l1.setBounds(500,50,400,40);
		l1.setFont(new Font("Cooper Black",Font.BOLD,30));
		
		
		b1 = new JButton("Back");
		b1.setBounds(10,10,100,30);
		b1.addActionListener(this);
		
		p2 = new JPanel();
		p2.setLayout(new GridBagLayout());
		p2.setBounds(0, 300, 1400, 405);
		p2.setBackground(new Color(152, 206, 234));
		
		t2 = new JTextField(20);
		t2.setBounds(500,150,100,30);
		
		b2 = new JButton("S");
		b2.setBounds(700,150,150,30);
		b2.addActionListener(this);
		
		String[] str2 = {"All","Id","Name","Hostel","Room_number"};
		c1 = new JComboBox(str2);
		c1.setSelectedIndex(0);
		c1.setBounds(500,100,150,30);
		c1.addActionListener(this);
		
		
		t1 = new JTable(0,0);
		model = new DefaultTableModel(new String[]{"ID","NAME","HOSTEL","ROOM_NO"},0);
		String str = "select id,name,hostel,room_no from student_info where room_no="+room;
		rs = st.executeQuery(str);
		while(rs.next()){
			model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
		}
		t1.setModel(model);
		t1.setPreferredScrollableViewportSize(new Dimension(1000,300));
		t1.setFillsViewportHeight(true);
		tableContainer = new JScrollPane(t1);
    
	    
		f1.add(p1);
		f1.add(p2);
		p1.add(b1);
		p1.add(l1);
		p1.add(c1);
		p1.add(b2);
		p1.add(t2);
        p2.add(tableContainer);
		
		
		f1.setVisible(true);
	   }
		
		
		catch(Exception e){}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == b1)
		{
			f1.dispose();
			new Info();
		
		}
		
		if(ae.getSource() == c1)
		{
			jc = (JComboBox)ae.getSource();
			msg = (String)jc.getSelectedItem();
			
			
		
		}
		
		if(ae.getSource() == b2)
		{
		
			switch(msg){
			
			case "Id":
				f1.dispose();
				new Existingid(t2.getText());
				break;
				

			case "Name":
				f1.dispose();
				new Existingname(t2.getText());
				break;
			

			case "Hostel":
				
				f1.dispose();
				new Existinghostel(t2.getText());
				break;
				
				

			case "Room_number":
				
				f1.dispose();
				new Existingroom(t2.getText());
				break;
				

			
			}	
		}
		
	}
	
	
	public static void main(String args[])
	{
		new Existing();
		
	}
	
	void ab(){
		
		System.out.println("Hello");
	}
	
}
