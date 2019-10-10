import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login implements ActionListener{

	JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JPanel p1,p2,p3;
	JTextField t1,t2,t3,t4;
	JPasswordField t5;
	JButton b1;
	Image img;
	
	Login()
	{
		
		f1 = new JFrame("Login Page");
		f1.setLayout(null);
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    f1.getContentPane().setBackground(new Color(152, 206, 234));
		ImageIcon img1= new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\welcome.JPG");
		ImageIcon img2=new ImageIcon("C:\\Users\\Udayan R Birajdar\\Desktop\\Assignments\\Clg_work\\TE_sem1\\dbms\\miniprojectiamges\\nbnbg.png");
		
		l1 = new JLabel("Welcome To Sinhgad Institute");
		l1.setBounds(220,25,980,100);
		l1.setFont(new Font("Cooper Black",Font.BOLD,50));
		
		l11=new JLabel("");
		l11.setBounds(1150,-30,200,200);
		l11.setBackground(Color.black);
		l11.setIcon(img2);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(500, 170, 350, 400);
		p1.setBackground(new Color(152, 206, 234));
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 0, 1400, 150);
		p2.setBackground(new Color(152, 206, 234));
		
		
		
	
		l6 = new JLabel("Username : ");
		l6.setBounds(10,150,130,30);
		l6.setFont(new Font("Cooper Black",Font.PLAIN,20));
		l6.setForeground(Color.black);
		
		l7 = new JLabel("Password : ");
		l7.setBounds(10,200,130,30);
		l7.setFont(new Font("Cooper Black",Font.PLAIN,20));
		l7.setForeground(Color.black);	
		l8 = new JLabel("");
		l8.setBounds(540,460,300,20);
		
		l9 = new JLabel("");
		l9.setBounds(120,-80,300,300);				
		
		img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		l9.setIcon(new ImageIcon(img));
		
		
		t4 = new JTextField(20);
		t4.setBounds(150,150,130,30);
		
		t5 = new JPasswordField(20);
		t5.setBounds(150,200,130,30);
		
		b1 = new JButton("");
	    img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		b1.setIcon(new ImageIcon(img));
		b1.setBounds(110,290,120,30);

		b1.addActionListener(this);
		
		p2.add(l1);
		p2.add(l11);
		
		f1.add(p2);		f1.add(p1);		
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);		
		
		
		
		
		p1.add(t4);
		p1.add(t5);
		p1.add(b1);
		
		f1.setVisible(true);		
	}
	public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource() == b1)
    	{
    		String name,pwd;
    		
    		name = t4.getText();
    		pwd = t5.getText();
    		
    		
    		if(name.equals("admin"))
    		{
    			if(pwd.equals("admin"))
    			{
    				
    					f1.setVisible(false);
        				new New_user();
    				
    			}
    						
    		}
    			else {
    				l8.setText("Incorrect Username or Password");
    				l8.setForeground(new Color(255,0,0));
    				l8.setBounds(540,460,300,20);
    			}
    			
    		}
    		else {
				l8.setText("Incorrect Username or Password");
				l8.setForeground(new Color(255,0,0));
				l8.setBounds(540,460,300,20);
			}
    		
    		
    		
       }
      
	public static void main(String[] args) {
		new Login();
	}
}
