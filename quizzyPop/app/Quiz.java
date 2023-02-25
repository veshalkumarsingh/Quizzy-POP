package quizzyPop.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Quiz extends JFrame implements ActionListener{
	
	//declaring Globally
	JLabel qno,que;
	JRadioButton opt1,opt2,opt3,opt4;
    JButton next,submit;
    ButtonGroup groupOpt;

    public static int timer = 20;
    public static int ans_given = 0;
    public static int score = 0;
	public static int count = 0;
	
	//array for questions
	String questions[][] = new String[10][5];
	String answers[][] = new String[10][2];
	String userAns[][] = new String[10][1];
	
	
	String name;
	
	Quiz(String name){
		this.name = name;
		

		//to set frame size and Location
				setLocation(300,100);
				setSize(1000,650);
				getContentPane().setForeground(Color.white);
				setLayout(null);
				
		//to set Image
				ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/shutter.jpg"));
				JLabel image = new JLabel(i1);
				//to set size-bounds of the image
				image.setBounds(0,0,1100,300);
				add(image);
				
				 //setting ques Label
				qno = new JLabel();
				qno.setBounds(30,320,50,30);
				qno.setFont(new Font("Comic Sans Ms",Font.BOLD,20));
				add(qno);
				
	//setting questions
				que = new JLabel();
				que.setBounds(60,320,900,30);
				que.setFont(new Font("Comic Sans Ms",Font.BOLD,20));
				add(que);
		        
					
		//setting question and answers
				questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
		        questions[0][1] = "JVM";
		        questions[0][2] = "JDB";
		        questions[0][3] = "JDK";
		        questions[0][4] = "JRE";

		        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
		        questions[1][1] = "int";
		        questions[1][2] = "Object";
		        questions[1][3] = "long";
		        questions[1][4] = "void";

		        questions[2][0] = "Which package contains the Random class?";
		        questions[2][1] = "java.util package";
		        questions[2][2] = "java.lang package";
		        questions[2][3] = "java.awt package";
		        questions[2][4] = "java.io package";

		        questions[3][0] = "An interface with no fields or methods is known as?";
		        questions[3][1] = "Runnable Interface";
		        questions[3][2] = "Abstract Interface";
		        questions[3][3] = "Marker Interface";
		        questions[3][4] = "CharSequence Interface";

		        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
		        questions[4][1] = "Stack";
		        questions[4][2] = "String memory";
		        questions[4][3] = "Random storage space";
		        questions[4][4] = "Heap memory";

		        questions[5][0] = "Which of the following is a marker interface?";
		        questions[5][1] = "Runnable interface";
		        questions[5][2] = "Remote interface";
		        questions[5][3] = "Readable interface";
		        questions[5][4] = "Result interface";

		        questions[6][0] = "Which keyword is used for accessing the features of a package?";
		        questions[6][1] = "import";
		        questions[6][2] = "package";
		        questions[6][3] = "extends";
		        questions[6][4] = "export";

		        questions[7][0] = "In java, jar stands for?";
		        questions[7][1] = "Java Archive Runner";
		        questions[7][2] = "Java Archive";
		        questions[7][3] = "Java Application Resource";
		        questions[7][4] = "Java Application Runner";

		        questions[8][0] = "Which of the following is a mutable class in java?";
		        questions[8][1] = "java.lang.StringBuilder";
		        questions[8][2] = "java.lang.Short";
		        questions[8][3] = "java.lang.Byte";
		        questions[8][4] = "java.lang.String";

		        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
		        questions[9][1] = "Bytecode is executed by JVM";
		        questions[9][2] = "The applet makes the Java code secure and portable";
		        questions[9][3] = "Use of exception handling";
		        questions[9][4] = "Dynamic binding between objects";
		        
		        answers[0][1] = "JDB";
		        answers[1][1] = "int";
		        answers[2][1] = "java.util package";
		        answers[3][1] = "Marker Interface";
		        answers[4][1] = "Heap memory";
		        answers[5][1] = "Remote interface";
		        answers[6][1] = "import";
		        answers[7][1] = "Java Archive";
		        answers[8][1] = "java.lang.StringBuilder";
		        answers[9][1] = "Bytecode is executed by JVM";
		        
    
	//JRadio button for options  mcq(round shape)
		        
		        opt1 = new JRadioButton();
		        opt1.setBounds(70,390,500,30);
		        opt1.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
		        opt1.setBackground(Color.white);
		        add(opt1);
		        
		        opt2 = new JRadioButton();
		        opt2.setBounds(70,420,500,30);
		        opt2.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
		        opt2.setBackground(Color.white);
		        add(opt2);
		        
		        opt3 = new JRadioButton();
		        opt3.setBounds(70,450,500,30);
		        opt3.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
		        opt3.setBackground(Color.white);
		        add(opt3);
		        
		        opt4 = new JRadioButton();
		        opt4.setBounds(70,480,500,30);
		        opt4.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
		        opt4.setBackground(Color.white);
		        add(opt4);
		        
		        
    //Button Group Class to select only one Option
		        groupOpt = new ButtonGroup();
		        groupOpt.add(opt1);
		        groupOpt.add(opt2);
		        groupOpt.add(opt3);
		        groupOpt.add(opt4);
		        
      //adding buttons for next and submit
		        
		       next = new JButton("Next");
		       next.setBounds(700,450,150,35);
			   next.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
			   next.setForeground(Color.WHITE);
		       next.setBackground(Color.BLACK);
			   next.addActionListener(this);
			   add(next);
			   
			   submit = new JButton("Submit");
			   submit.setBounds(700,500,150,35);
		       submit.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
		       submit.setForeground(Color.WHITE);
			   submit.setBackground(Color.BLACK);
			   submit.setEnabled(false);
	           submit.addActionListener(this);
			   add(submit);
			   
			   
			   //calling function to start
			   start(count);     
			  setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == next) {
	            repaint();
	            opt1.setEnabled(true);
	            opt2.setEnabled(true);
	            opt3.setEnabled(true);
	            opt4.setEnabled(true);
	            
	            ans_given = 1;
	            if (groupOpt.getSelection() == null) {
	            	userAns[count][0] = "";
	            } else {
	            	userAns[count][0] = groupOpt.getSelection().getActionCommand();
	            }
	            
	            if (count == 8) {
	                next.setEnabled(false);
	                submit.setEnabled(true);
	            }
	            
	            count++;
	            start(count);
	        } else if (ae.getSource() == submit) {
	            ans_given = 1;
	            if (groupOpt.getSelection() == null) {
	            	userAns[count][0] = "";
	            } else {
	            	userAns[count][0] = groupOpt.getSelection().getActionCommand();
	            }

	            for (int i = 0; i < userAns.length; i++) {
	                if (userAns[i][0].equals(answers[i][1])) {
	                    score += 10;
	                } else {
	                    score += 0;
	                }
	            }
	            setVisible(false);
	            new Score(name, score);
	        }
	    }
	    
	    public void paint(Graphics g) {
	    	  super.paint(g);
			  
	           String time = "Time-Left " + timer +" seconds";
	           g.setColor(Color.DARK_GRAY);
	           g.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
	           
	           if(timer>0) {
	        	   g.drawString(time, 700, 430);
	           }else {
	        	   g.drawString("Time-UP !!",700, 430);
	           }
	           timer--;//19
	           
	     //USing MultiThreading   
	           try {
	        	   Thread.sleep(1000);
	    //calling repaint method to call paint again    	   
	        	   repaint();
	           }catch(Exception e) {
	        	   e.printStackTrace();
	           }
	        
	        if (ans_given == 1) {
	            ans_given = 0;
	            timer = 20;
	        } else if (timer < 0) {
	            timer = 20;
	            opt1.setEnabled(true);
	            opt2.setEnabled(true);
	            opt3.setEnabled(true);
	            opt4.setEnabled(true);
	            
	            if (count == 8) {
	                next.setEnabled(false);
	                submit.setEnabled(true);
	            }
	            if (count == 9) { // submit button
	                if (groupOpt.getSelection() == null) {
	                	userAns[count][0] = "";
	                } else {
	                	userAns[count][0] = groupOpt.getSelection().getActionCommand();
	                }
	                
	                for (int i = 0; i < userAns.length; i++) {
	                    if (userAns[i][0].equals(answers[i][1])) {
	                        score += 10;
	                    } else {
	                        score += 0;
	                    }
	                }
	                setVisible(false);
	                new Score(name, score);
	            } else { // next button
	                if (groupOpt.getSelection() == null) {
	                	userAns[count][0] = "";
	                } else {
	                    userAns[count][0] = groupOpt.getSelection().getActionCommand();
	                }
	                count++; // 0 // 1
	                start(count);
	            }
	        }
	        
	    }
	    
	    public void start(int count) {
	        qno.setText("" + (count + 1) + ". ");
	        que.setText(questions[count][0]);
	        opt1.setText(questions[count][1]);
	        opt1.setActionCommand(questions[count][1]);
	        
	        opt2.setText(questions[count][2]);
	        opt2.setActionCommand(questions[count][2]);
	        
	        opt3.setText(questions[count][3]);
	        opt3.setActionCommand(questions[count][3]);
	        
	        opt4.setText(questions[count][4]);
	        opt4.setActionCommand(questions[count][4]);
	        
	        groupOpt.clearSelection();
	    }
	    
	    public static void main(String[] args) {
	        new Quiz("User");
	    }
	}