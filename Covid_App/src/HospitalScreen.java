import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class HospitalScreen extends JFrame {

	public HospitalScreen(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hospital");
		setLayout(new GridLayout(5,1));
		setSize(450, 500);
		setLocationRelativeTo(null);
		
		String[] istanbulHospitals = {"Özel Medistate Kavacık Hastanesi (Beykoz)", 
				"Özel Esthetica Levent Hastanesi (Beşiktaş)",
				"Üsküdar Devlet Hastanesi", 
				"Özel Okmeydanı Hastanesi (Beyoğlu)"};
		
		String[] ankaraHospitals= {"Ankara Akyurt Devlet Hastanesi",
				"Beypazarı Devlet Hastanesi",
				"Kızılcahamam Devlet Hastanesi",
				"Hacettepe Üniversitesi Erişkin Hastanesi"};
		
		String[] izmirHospitals= {"Aliağa Devlet Hastanesi", 
				"Seferihisar Necat Hepkon Devlet Hastanesi", 
				"Urla Devlet Hastanesi", 
				"Özel İzmir Hastanesi"};
		
		String hospital = "";
		int queue = 0;
		
		if(LogInSignUp.signed_user.getCity().equals("Istanbul")) {
		   queue = LogInSignUp.LIST.countIstanbul();
		   hospital = istanbulHospitals[queue % 4];
		}
		
		else if(LogInSignUp.signed_user.getCity().equals("Ankara")) {
		   queue = LogInSignUp.LIST.countAnkara();
		   hospital = ankaraHospitals[queue % 4];	
		}
		
		else if(LogInSignUp.signed_user.getCity().equals("Izmir")) {
		   queue = LogInSignUp.LIST.countIzmir();
		   hospital = izmirHospitals[queue % 4];	
		};
		
		JLabel nameLabel= new JLabel("Name: " + LogInSignUp.signed_user.getFirst_name());
		JLabel surnameLabel= new JLabel("Surname: "+ LogInSignUp.signed_user.getLast_name());
		JLabel tcNoLabel = new JLabel("TC Number: "+ LogInSignUp.signed_user.getTc_number());
		JLabel cityLabel = new JLabel("City: "+ LogInSignUp.signed_user.getCity());
		JLabel queueLabel = new JLabel("Your position in the queue: "+ queue );
		JLabel hospitalLabel = new JLabel("Your hospital is: " + hospital );
		
		JButton goBackButton = new JButton("Go Back");
		
		
		JPanel nameSurnamePanel = new JPanel(new FlowLayout());
		nameSurnamePanel.add(nameLabel);
		nameSurnamePanel.add(surnameLabel);
		add(nameSurnamePanel);
		
		JPanel tcNoCityPanel = new JPanel(new FlowLayout());
		tcNoCityPanel.add(tcNoLabel);
		tcNoCityPanel.add(cityLabel);
		add(tcNoCityPanel);
		
		JPanel queuePanel = new JPanel(new FlowLayout());
		queuePanel.add(queueLabel);
		add(queuePanel);
		
		JPanel hospitalPanel = new JPanel(new FlowLayout());
		hospitalPanel.add(hospitalLabel);
		add(hospitalPanel);
		
		JPanel goBackButtonPanel = new JPanel(new FlowLayout());
		goBackButtonPanel.add(goBackButton);
		add(goBackButtonPanel);
		
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new SelectionScreen().setVisible(true);
			}
		});
	}
}
