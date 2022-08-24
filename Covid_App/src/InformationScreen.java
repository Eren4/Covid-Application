import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationScreen extends JFrame {
	
	public InformationScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(12,2));
		setSize(750, 450);
		setTitle("Information");
		setLocationRelativeTo(null);
		
		JLabel info = new JLabel("Things to Keep in Mind to Protect Yourself from the Virus");
		JLabel info1 = new JLabel("*Wear a mask when you go out. Make sure that the mask covers your nose.");
		JLabel info2 = new JLabel("*Keep your distance with strangers");
		JLabel info3 = new JLabel("*Try not to stay in crowded places.");
		JLabel info4 = new JLabel("*Always wash your hands when you get the opportunity. When you see a hand sanitizer somewhere, use it");
		
	    JButton backButton = new JButton("Go Back");
	    
		JPanel infoPanel = new JPanel(new FlowLayout());
		JPanel buttonPanel = new JPanel(new FlowLayout());
		
		infoPanel.add(info);
		buttonPanel.add(backButton);
		
		add(infoPanel);
		add(info1);
		add(info2);
		add(info3);
		add(info4);
		add(buttonPanel);
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SelectionScreen().setVisible(true);
				setVisible(false);
			}
		});
	}
}
