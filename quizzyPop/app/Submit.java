package quizzyPop.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Submit extends JFrame implements ActionListener{
	
	JButton start,back;
	
	String name;
	Submit(String name){
		this.name = name;
		
		//to set background color of frame
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		//creating heading
		JLabel heading = new JLabel("Welcome "+name+" To Quizzy-PoP");
		heading.setBounds(150,20,700,50);
		heading.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		heading.setForeground(Color.RED);
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(100,50,700,450);
		rules.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		rules.setText( "<html>"+ 
                "1. ALL QUESTIONS ALL COMPULSORY" + "<br><br>" +
                "2. DO NOT USE MOBILE PHONES" + "<br><br>" +
                "3. BE STRAIGHT DURING QUIZ" + "<br><br>" +
                "4. YOU WILL GET YOUR SCORE AFTER FINISHING THE QUIZ" + "<br><br>" +
                "5. GOOD LUCK" + "<br><br>" +
            "<html>");
		add(rules);
		
		//adding buttons
		
	    start = new JButton("START");
		start.setBounds(345,440,150,25);
		start.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
		start.setForeground(Color.WHITE);
		start.setBackground(Color.BLACK);
		start.addActionListener(this);
		add(start);
		
		back = new JButton("Back");
		back.setBounds(370,480,100,23);
		back.setFont(new Font("Comic Sans Ms",Font.BOLD,12));
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLACK);
		back.addActionListener(this);
		add(back);
		
		//to set frame size and Location
				setLocation(300,100);
				setSize(900,600);
				setVisible(true);
	
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == start) {
			setVisible(false);
			new Quiz(name);
			
		}else if(ae.getSource()==back) {
			setVisible(false);
			new Login();
		}
		
	}
	
	
	
	public static void main(String args[]) {
		new Submit("User");
		
	}

}
