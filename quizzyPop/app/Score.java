package quizzyPop.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
	JButton exit;
       
	Score(String name, int score){
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		//to set Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
		JLabel image = new JLabel(i1);
		//to set size-bounds of the image
		image.setBounds(0,0,400,580);
		add(image);
		
		//setting heading and styling the font,color
		JLabel heading = new JLabel("Great! For Playing QUIZZY-POP");
		heading.setBounds(450,60,500,45);
		heading.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		heading.setForeground(Color.RED);
		add(heading);
		
		//name label
		JLabel n = new JLabel("Thank You "+ name);
		n.setBounds(600,150,300,30);
		n.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		n.setForeground(Color.DARK_GRAY);
		add(n);
		
		//score label
		JLabel s = new JLabel("Your Score is "+score);
		s.setBounds(600,200,300,30);
		s.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		s.setForeground(Color.DARK_GRAY);
		add(s);
		
	
		
		//adding buttons
		
		exit = new JButton("Exit");
		exit.setBounds(650,380,100,23);
		exit.setFont(new Font("Comic Sans Ms",Font.BOLD,20));
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.BLACK);
		exit.addActionListener(this);
		add(exit);
		

		//to set frame size , location etc
		setLocation(300,100);
		setSize(1000,600);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
			setVisible(false);
			System.exit(ABORT);
		
	}
	
	
	
    public static void main(String[] args) {
        new Score("User", 0);
    }
}