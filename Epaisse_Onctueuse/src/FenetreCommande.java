import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreCommande extends JFrame implements ActionListener,WindowListener{
	private JPanel panel_commande = new JPanel(); 
	private JLabel label_selection = new JLabel("Vous avez validé votre quiche");
	private JLabel label_prix = new JLabel("Le total de votre commande s'élève à 8 €");
	private JButton bouton_payer = new JButton("Payer ma commande");

	public FenetreCommande() {
		this.setTitle("QuicH'24 : Commande");
		this.setSize(400,200);
		this.setResizable(false);
		panel_commande.setLayout(null); //On decide de placer chaque élement avec sa position en pixels


		// ajout des differents composants de connexion sur le layout
		panel_commande.add(label_selection);
		label_selection.setBounds(15,20,200,20);
		panel_commande.add(label_prix);
		label_prix.setBounds(15,60,300,20);
		panel_commande.add(bouton_payer);
		bouton_payer.setBounds(20,90,200,25);
		bouton_payer.addActionListener(this);

		
		this.setContentPane(panel_commande);
		this.setVisible(true);
	}
	
		
	public void actionPerformed(ActionEvent touche) {
		Object source = touche.getSource();
			
		if (source==bouton_payer){
			this.dispose();
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
