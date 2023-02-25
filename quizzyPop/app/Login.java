package quizzyPop.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	//declaring globally 
	JButton submit,exit;
	JTextField tfname ;
	
	Login(){
				
		//to set background color of frame
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		//to set Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pop-quiz.jpg"));
		JLabel image = new JLabel(i1);
		//to set size-bounds of the image
		image.setBounds(0,0,500,580);
		add(image);
		
		//setting heading and styling the font,color
		JLabel heading = new JLabel("QUIZZY-POP");
		heading.setBounds(630,60,300,45);
		heading.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		heading.setForeground(Color.RED);
		add(heading);
		
		JLabel name = new JLabel("Enter Your First Name");
		name.setBounds(640,150,300,20);
		name.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		name.setForeground(Color.DARK_GRAY);
		add(name);
		
		
		//using text-fields
	    tfname = new JTextField();
		tfname.setBounds(600,200,300,35);
		tfname.setFont(new Font("Comic Sans Ms",Font.BOLD,20));
		add(tfname);
		
		//adding buttons
		
	    submit = new JButton("Submit");
		submit.setBounds(670,240,150,25);
		submit.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLACK);
		submit.addActionListener(this);
		add(submit);
		
		exit = new JButton("Exit");
		exit.setBounds(700,280,100,23);
		exit.setFont(new Font("Comic Sans Ms",Font.BOLD,12));
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.BLACK);
		exit.addActionListener(this);
		add(exit);
		

		//to set frame size , location etc
		setLocation(300,100);
		setSize(1000,600);
		setVisible(true);
		
		
		
}
	
	//for action event override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == submit) {
			String name = tfname.getText();
			setVisible(false);
			new Submit(name);
			
		}else if(ae.getSource()==exit) {
			setVisible(false);
			System.exit(ABORT);
		}
		
	}
	
	
	
	public static void main(String args[]) {
	new Login();
}

}
