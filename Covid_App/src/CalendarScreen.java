import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalendarScreen extends JFrame {
	
	Patient signedUser = LogInSignUp.LIST.getLast();
	PatientBST ourTree = LogInSignUp.TREE;
	
	int age = signedUser.getAge();
	
	String right90Date = "10-05-2021 and 17-05-2021";
	String left90Date = "18-05-2021 and 25-05-2021";
	
	String right90Interval = "Older than 90";
	String left90Interval = "75-89";
	
	String right60Date = "26-05-2021 and 01-06-2021";
	String left60Date = "02-06-2021 and 09-06-2021";
	
	String right60Interval = "60-74";
	String left60Interval = "50-59";
	
	String right40Date = "10-06-2021 and 17-06-2021";
	String left40Date = "18-06-2021 and 25-06-2021";
	
	String right40Interval = "40-49";
	String left40Interval = "25-39";
	
	String right10Date = "26-06-2021 and 02-07-2021";
	String left10Date = "03-07-2021 and 10-07-2021";
	
	String right10Interval = "10-24";
	String left10Interval = "0-9";
	
	String date = "";
	String interval = "";
	
	public CalendarScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setTitle("Calendar");
		setLayout(new GridLayout(7, 1));
		setLocationRelativeTo(null);
		
		if(ourTree.hasLeft(10)) {
			date = left10Date;
			interval = left10Interval;
		}
		else if(ourTree.hasRight(10)) {
			date = right10Date;
			interval = right10Interval;
		}
		else if(ourTree.hasLeft(40)) {
			date = left40Date;
			interval = left40Interval;
		}
		else if(ourTree.hasRight(40)) {
			date = right40Date;
			interval = right40Interval;
		}
		else if(ourTree.hasLeft(60)) {
			date = left60Date;
			interval = left60Interval;
		}
		else if(ourTree.hasRight(60)) {
			date = right60Date;
			interval = right60Interval;
		}
		else if(ourTree.hasLeft(90)) {
			date = left90Date;
			interval = left90Interval;
		}
		else if(ourTree.hasRight(90)) {
			date = right90Date;
			interval = right90Interval;
		}
		else {
			date = "";
		    interval = "";
		}
		
		JPanel panel1 = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		JPanel panel3 = new JPanel(new FlowLayout());
		JPanel panel4 = new JPanel(new FlowLayout());
		JPanel panel5 = new JPanel(new FlowLayout());
		JPanel panel6 = new JPanel(new FlowLayout());
		JPanel buttonPanel = new JPanel(new FlowLayout());
		
		JLabel label1 = new JLabel("Full Name: " + signedUser.getFirst_name() + " " + signedUser.getLast_name());
		JLabel label2 = new JLabel("TC Number: " + signedUser.getTc_number());
		JLabel label3 = new JLabel("Your age is: " + signedUser.getAge());
		JLabel label4 = new JLabel("Your age is in the interval: " + interval);
		JLabel label5 = new JLabel("Go take your vaccine between " + date);
		JLabel label6 = new JLabel("To learn your hospital, please check the Hospital section");
		JButton goBackButton = new JButton("Go Back");
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		buttonPanel.add(goBackButton);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(buttonPanel);
		
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new SelectionScreen().setVisible(true);
			}
		});
	}

}
