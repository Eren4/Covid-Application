import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LogInSignUp extends JFrame {
	public static PatientLinkedList LIST = new PatientLinkedList();
	public static PatientBST TREE = new PatientBST();
	public static LogInSignUp log_main_screen;
	public static Patient signed_user;
	
	JRadioButton login_radio_button = new JRadioButton("Login");
	JRadioButton signup_radio_button = new JRadioButton("Sign Up");
	ButtonGroup login_signup_button_group = new ButtonGroup();
	
	JRadioButton male_radio_button = new JRadioButton("Male");
	JRadioButton female_radio_button = new JRadioButton("Female");
	ButtonGroup gender_button_group = new ButtonGroup();
	
	JButton loginButton = new JButton("Login");
	JButton signupButton = new JButton("Sign Up");
	JButton clearButton = new JButton("Clear");
	
	JLabel name_label = new JLabel("Name");
	JLabel surname_label = new JLabel("Surname");
	JLabel password_label_up = new JLabel("Password");
	JLabel password_label_down1 = new JLabel("Password");
	JLabel password_label_down2 = new JLabel("Password Again");
	JLabel tc_number_label_up = new JLabel("TC Number");
	JLabel tc_number_label_down = new JLabel("TC Number");
	JLabel city_label = new JLabel("City");
	JLabel gender_label = new JLabel("Gender");
	JLabel dob_label = new JLabel("Date of Birth");
	
	JTextField name_txt = new JTextField(10);
	JTextField surname_txt = new JTextField(10);
	JTextField tc_number_txt_up = new JTextField(10);
	JTextField tc_number_txt_down = new JTextField(10);
	JTextField dob_txt = new JTextField(10);
	
	JPasswordField password_up = new JPasswordField(10);
	JPasswordField password_down1 = new JPasswordField(10);
	JPasswordField password_down2 = new JPasswordField(10);
	
	public LogInSignUp() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Register Screen");
		setLayout(new GridLayout(13,1));
		setSize(300, 500);
		
		login_signup_button_group.add(login_radio_button);
		login_signup_button_group.add(signup_radio_button);
		JPanel login_signup_panel = new JPanel(new FlowLayout());
		login_signup_panel.add(login_radio_button);
		login_signup_panel.add(signup_radio_button);
		add(login_signup_panel);
		
		JPanel tc_number_panel_up = new JPanel(new FlowLayout());
		tc_number_panel_up.add(tc_number_label_up);
		tc_number_panel_up.add(tc_number_txt_up);
		add(tc_number_panel_up);
		
		JPanel password_panel = new JPanel(new FlowLayout());
		password_panel.add(password_label_up);
		password_panel.add(password_up);
		add(password_panel);
		
		JPanel login_button_panel = new JPanel(new FlowLayout());
		login_button_panel.add(loginButton);
		add(login_button_panel);
		
		JPanel name_panel = new JPanel(new FlowLayout());
		name_panel.add(name_label);
		name_panel.add(name_txt);
		add(name_panel);
		
		JPanel surname_panel = new JPanel(new FlowLayout());
		surname_panel.add(surname_label);
		surname_panel.add(surname_txt);
		add(surname_panel);
		
		JPanel password2_panel = new JPanel(new FlowLayout());
		password2_panel.add(password_label_down1);
		password2_panel.add(password_down1);
		add(password2_panel);
		
		JPanel password3_panel = new JPanel(new FlowLayout());
		password3_panel.add(password_label_down2);
		password3_panel.add(password_down2);
		add(password3_panel);
		
		JPanel dob_panel = new JPanel(new FlowLayout());
		dob_panel.add(dob_label);
		dob_panel.add(dob_txt);
		add(dob_panel);
		
		JPanel tc_number_panel_down = new JPanel(new FlowLayout());
		tc_number_panel_down.add(tc_number_label_down);
		tc_number_panel_down.add(tc_number_txt_down);
		add(tc_number_panel_down);
		
		JPanel gender_panel = new JPanel(new FlowLayout());
		gender_button_group.add(male_radio_button);
		gender_button_group.add(female_radio_button);
		gender_panel.add(gender_label);
		gender_panel.add(male_radio_button);
		gender_panel.add(female_radio_button);
		add(gender_panel);
		
		DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<String>();
	    JComboBox<String> cities = new JComboBox<String>(dcm);
	    dcm.addElement("Istanbul");
	    dcm.addElement("Ankara");
	    dcm.addElement("Izmir");
	    JPanel city_panel = new JPanel(new FlowLayout());
	    city_panel.add(city_label);
	    city_panel.add(cities);
	    add(city_panel);
	    
	    JPanel signup_clear = new JPanel(new FlowLayout());
	    signup_clear.add(signupButton);
	    signup_clear.add(clearButton);
	    add(signup_clear);
	    
	    name_txt.setEditable(false); 
		surname_txt.setEditable(false) ;
		password_down1.setEditable(false);
		tc_number_txt_up.setEditable(false);
		tc_number_txt_down.setEditable(false);
		password_down2.setEditable(false);
		signupButton.setEnabled(false);
		clearButton.setEnabled(false);
		password_up.setEditable(false);
		loginButton.setEnabled(false);
		male_radio_button.setEnabled(false);
		female_radio_button.setEnabled(false);
		dob_txt.setEditable(false);
		cities.setEnabled(false);
		
	    login_radio_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 name_txt.setEditable(false); 
				 surname_txt.setEditable(false) ;
				 password_down1.setEditable(false);
				 tc_number_txt_up.setEditable(false);
				 password_down2.setEditable(false);
				 signupButton.setEnabled(false);
				 clearButton.setEnabled(false);
				 cities.setEnabled(false);
				 male_radio_button.setEnabled(false);
				 female_radio_button.setEnabled(false);
				 tc_number_txt_up.setEditable(true);
				 password_up.setEditable(true);
				 loginButton.setEnabled(true);
				 tc_number_txt_down.setEditable(false);
				 dob_txt.setEditable(false);
			}
		});
	    signup_radio_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 name_txt.setEditable(true); 
				 surname_txt.setEditable(true) ;
				 password_down1.setEditable(true);
				 tc_number_txt_up.setEditable(true);
				 password_down2.setEditable(true);
				 signupButton.setEnabled(true);
				 clearButton.setEnabled(true);
				 cities.setEnabled(true);
				 male_radio_button.setEnabled(true);
				 female_radio_button.setEnabled(true);
				 tc_number_txt_up.setEditable(false);
				 password_up.setEditable(false);
				 loginButton.setEnabled(false);
				 tc_number_txt_down.setEditable(true);
				 dob_txt.setEditable(true);
			}
		});
	    clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 tc_number_txt_up.setText("");
				 name_txt.setText("");
				 surname_txt.setText("");
				 password_down1.setText("");
				 tc_number_txt_up.setText("");
				 password_down2.setText("");
				 password_up.setText("");
				 tc_number_txt_down.setText("");
				 dob_txt.setText("");
				 gender_button_group.clearSelection();
				 cities.setSelectedIndex(0);
			}
		});
	    signupButton.addActionListener(new ActionListener() {
			private PatientLinkedList patientLinkedList;

			public void actionPerformed(ActionEvent e) {
				String datePattern = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-(\\d{4})";
				String tcPattern = "\\d{11}";
				
				if(name_txt.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your name");
				
				else if(surname_txt.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your surname");
				
				else if(password_down1.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your password");
				
				else if(password_down2.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You need to enter your password again");
				
				else if(!Arrays.equals(password_down1.getPassword(), password_down2.getPassword()))
					JOptionPane.showMessageDialog(null, "Your entered passwords don't match. Please enter them again");
				
				else if(dob_txt.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your date of birth");
				
				else if(!dob_txt.getText().matches(datePattern))
					JOptionPane.showMessageDialog(null, "Your date should be in DD-MM-YYYY format.");
				
				else if(tc_number_txt_down.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your TC number");
				
				else if(!tc_number_txt_down.getText().matches(tcPattern))
					JOptionPane.showMessageDialog(null, "Your TC number should contain exactly 11 digits");
				
				else if(LIST.containsTC(tc_number_txt_down.getText()))
					JOptionPane.showMessageDialog(null, "Please don't enter someone else's TC number");
				
				else if(male_radio_button.isSelected() == false &&
						female_radio_button.isSelected() == false)
					JOptionPane.showMessageDialog(null, "Please select  your gender");

				else {
				char[] password = password_down2.getPassword();
				String passwordtxt = "";
				for(int i = 0; i < password.length; i++) 
					passwordtxt += password[i];
				
				String gender;
				if(male_radio_button.isSelected())
					gender = "Male";
				else
					gender = "Female";
				
				signed_user = new Patient(name_txt.getText(), surname_txt.getText()
						, tc_number_txt_down.getText(), dob_txt.getText()
						, passwordtxt , gender, (String) cities.getSelectedItem());
				
				int age = signed_user.getAge();
				if(age == 10 || age == 40 || age == 60 || age == 90
						|| age == 50 || age == 25 || age == 75)
					age++;
				
				LIST.insert_at_last(signed_user);
				
				TREE.refresh();
				TREE.insert(age);
				
				clearButton.doClick();
				
				System.out.println(signed_user);
	
				new SelectionScreen().setVisible(true);
				setVisible(false);
				}
			}
		});
	    loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(signed_user == null) {
					JOptionPane.showMessageDialog(null, "Logging in before signing up is not possible");
					return;
				}
				
				String entered_tc = tc_number_txt_up.getText();
				
				String entered_psswrd = "";
			    char[] psswrd = password_up.getPassword();
			    for(int i = 0; i < psswrd.length; i++)
			    	entered_psswrd += psswrd[i];
			    
				if(signed_user.getTc_number().equals(entered_tc) &&
						signed_user.getPassword().equals(entered_psswrd)) {
				clearButton.doClick();
				new SelectionScreen().setVisible(true);
				setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "ERROR. Please check your TC number and password and try again");
				}
			}
		});
	}
	public static void main(String[] args) {
		 LIST.insert_at_last(new Patient("Ahmet", "Tosun", "39612047992", "07-04-1960", "ahmettosun123", "Male", "Istanbul"));
		 LIST.insert_at_last(new Patient("Mahmut", "Yılmaz", "4852479827", "23-11-1970", "mahmut1970", "Male", "Izmir"));
		 LIST.insert_at_last(new Patient("İlker", "Özyurt", "47120037925", "19-02-1974", "ozyurtilker74", "Male", "Izmir"));
		 LIST.insert_at_last(new Patient("Hülya", "Çelik", "58127039572", "30-07-1993", "boncuk001", "Female", "Ankara"));
		 LIST.insert_at_last(new Patient("Çiğdem", "Korkmaz", "29401569211", "10-07-2000", "cigdemasd213", "Female", "Istanbul"));
		 LIST.insert_at_last(new Patient("Metehan", "Alkan", "10593276915", "12-09-1978", "moduchanyu1978", "Male", "Ankara"));
		 LIST.insert_at_last(new Patient("Hasan", "Kılınç", "15733208982", "24-05-1946", "kilichasan46", "Male", "Ankara"));
		 LIST.insert_at_last(new Patient("Çiğdem", "Cebeci", "49271597835", "09-03-1985", "cice1231985", "Female", "Izmir"));
		 LIST.insert_at_last(new Patient("Faruk", "Bulsaroğlu", "71938240018", "05-09-1946", "queenfaruk64", "Male", "Istanbul"));
		 LIST.insert_at_last(new Patient("Mehmet", "Tuncer", "20947150385", "05-05-1961", "lalesido", "Male", "Izmir"));
		 System.out.println("Every Person Is Completely Fictional\n");
		 LIST.output_list();
		 JOptionPane.showMessageDialog(null, "Important note: This is not a real-world application."
		 		+ " This application is created for a university project."
		 		+ " \nIt does not represent real-world things."
		 		+ " \nPlease don't take actions according to the informations provided in this application."
		 		+ " \nThe app will provide information according to the last signed user.");
		 log_main_screen = new LogInSignUp();
		 log_main_screen.setVisible(true);
	}
	
}
