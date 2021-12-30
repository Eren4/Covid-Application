import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionScreen extends JFrame {
	public static SelectionScreen selection_main_screen;

	JButton calendar = new JButton("Calendar");
	JButton restrictions = new JButton("Restrictions");
	JButton hospital = new JButton("Hospital");
	JButton intensity = new JButton("Intensity");
	JButton information = new JButton("Information");
	JButton life_fits_home = new JButton("Life Fits Home");
	JButton log_out = new JButton("Log Out");
	JLabel dummy = new JLabel("");
	
	
	
	public SelectionScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 2));
		setSize(500, 500);
		setTitle("Welcome to the COVID-19 Application");
		add(calendar);
		add(restrictions);
		add(hospital);
		add(intensity);
		add(information);
		add(life_fits_home);
		add(dummy);
		add(log_out);
		
		life_fits_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Stay Home, Stay Safe =)");
			}
		});
		
		information.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformationScreen().setVisible(true);
				setVisible(false);
			}
		});
		
		intensity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new IntensityScreen().setVisible(true);
			}
		});
		
		hospital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new HospitalScreen().setVisible(true);
			}
		});
		
		restrictions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RestrictionsScreen().setVisible(true);
			}
		});
		
		log_out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInSignUp.log_main_screen.setVisible(true);
				setVisible(false);
			}
		});
		
		calendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new CalendarScreen().setVisible(true);
			}
		});
	}
}
