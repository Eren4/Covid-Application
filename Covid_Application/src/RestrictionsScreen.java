import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RestrictionsScreen extends JFrame {
    Patient signedUser = LogInSignUp.LIST.getLast();
	
	int userAge = signedUser.getAge();
	
	String youngerThan20 = "You are younger than 20 years old";
	String olderThan65 = "You are older than 65 years old";
	String normalGroup = "You are between 20 and 65 years old";
	
	String group = "";
	
	String weekDay65 = "10:00 AM to 2:00 PM";
	String weekend65 = "You are not allowed to go outside on the weekends. Stay at home";
	
	String weekDay20 = "2:00 PM to 6:00 PM";
	String weekend20 = weekend65;
	
	String weekDayNormal = "5:00 AM to 7:00 PM";
	String weekendNormal = "Restrictions start on Friday at 7:00 PM and it will finish on Monday at 5:00 AM";
	
	String weekDay = "";
	String weekend = "";

	public RestrictionsScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setTitle("Restrictions");
		setLayout(new GridLayout(6, 1));
		
		if(userAge > 65) {
			group = olderThan65;
			weekDay = weekDay65;
			weekend = weekend65;
		}
		else if(userAge < 20) {
			group = youngerThan20;
			weekDay = weekDay20;
			weekend = weekend20;
		}
		else {
			group = normalGroup;
			weekDay = weekDayNormal;
			weekend = weekendNormal;
		}
		
		JPanel panel1 = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		JPanel panel3 = new JPanel(new FlowLayout());
		JPanel panel4 = new JPanel(new FlowLayout());
		JPanel panel5 = new JPanel(new FlowLayout());
		JPanel buttonPanel = new JPanel(new FlowLayout());
		
		JLabel label1 = new JLabel("Your age: " + userAge);
		JLabel label2 = new JLabel(group);
		JLabel label3 = new JLabel("You are allowed to go outside on:");
		JLabel label4 = new JLabel("Weekdays: " + weekDay);
		JLabel label5 = new JLabel("Weekends: " + weekend);
		
		JButton goBackButton = new JButton("Go Back");
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		buttonPanel.add(goBackButton);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(buttonPanel);
		
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new SelectionScreen().setVisible(true);
			}
		});
	}
}
