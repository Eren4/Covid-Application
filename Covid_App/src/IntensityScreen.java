import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IntensityScreen extends JFrame{
	public IntensityScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Intensity By Provinces");
		setLayout(new GridLayout(8,1));
		setSize(900, 600);
		setLocationRelativeTo(null);
		
		JLabel istanbulLabel = new JLabel("Istanbul");
		JLabel ankaraLabel = new JLabel("Ankara");
		JLabel izmirLabel = new JLabel("İzmir");
		
		JLabel istanbulMostIntense = new JLabel("Most risky provinces are: Bayrampaşa - "
				+ "Esenler - "
				+ "Gaziosmanpaşa - "
				+ "Güngören - "
				+ "Küçükçekmece - "
				+ "Zeytinburnu.");
		
		JLabel istanbulMildlyIntense = new JLabel("Mildly risky provinces are: Arnavutköy - "
				+ "Avcılar - "
				+ "Bağcılar - "
				+ "Bahçelievler - "
				+ "Kartal.");
				
		JLabel izmirMostIntense = new JLabel("Most risky provinces are: Torbalı - "
				+ "Menemen - "
				+ "Kemalpaşa - "
				+ "Karabağlar - "
				+ "Buca - "
				+ "Bayraklı.");
		
		JLabel izmirMildlyIntense = new JLabel("Mildly risky provinces are: Aliağa - "
				+ "Balçova - "
				+ "Bornova - "
				+ "Çiğli - "
				+ "Gaziemir - "
				+ "Narlıdere.");
		
		JLabel ankaraMostIntense = new JLabel("Most risky provinces are: Torbalı - "
				+ "Polatlı - "
				+ "Sincan -"
				+ "Yenimahalle - "
				+ "Gölbaşı - "
				+ "Kahramankazan.");
		
		JLabel ankaraMildlyIntense = new JLabel("Mildly risky provinces are: Beypazarı - "
				+ "Nallıhan - "
				+ "Çankaya - "
				+ "Güdül - "
				+ "Pursaklar - "
				+ "Elmadağ.");
		
		JLabel warningMessage = new JLabel("If you are not in the listed provinces on the top, "
				+ "you may go out, but make sure to put on your mask and keep your distance with strangers.");
		
		JPanel istanbulPanel = new JPanel(new FlowLayout());
		istanbulPanel.add(istanbulLabel);
		
		JPanel istanbulIntensePanel = new JPanel(new FlowLayout());
		istanbulIntensePanel.add(istanbulMostIntense);
		istanbulIntensePanel.add(istanbulMildlyIntense);
		
		JPanel izmirPanel = new JPanel(new FlowLayout());
		izmirPanel.add(izmirLabel);
		
		JPanel izmirIntensePanel = new JPanel(new FlowLayout());
		izmirIntensePanel.add(izmirMostIntense);
		izmirIntensePanel.add(izmirMildlyIntense);
		
		JPanel ankaraPanel = new JPanel(new FlowLayout());
		ankaraPanel.add(ankaraLabel);
		
		JPanel ankaraIntensePanel = new JPanel(new FlowLayout());
		ankaraIntensePanel.add(ankaraMostIntense);
		ankaraIntensePanel.add(ankaraMildlyIntense);
		
		JPanel warningPanel = new JPanel(new FlowLayout());
		warningPanel.add(warningMessage);
		
		add(istanbulPanel);
		add(istanbulIntensePanel);
		
		add(izmirPanel);
		add(izmirIntensePanel);
		
		add(ankaraPanel);
		add(ankaraIntensePanel);
		
		add(warningPanel);
		
		JButton backButton = new JButton("Go Back");
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(backButton);
		add(buttonPanel);
		 
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SelectionScreen().setVisible(true);
				setVisible(false);
			}
		});
	}
}
