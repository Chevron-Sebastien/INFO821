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

public class FenetreHisto extends JFrame implements ActionListener,WindowListener{
	private JPanel panel_histo = new JPanel(); 
	private JLabel label_historique = new JLabel("Voici l'historique de vos commandes :");
	private JList<String> liste_commandes = new JList<String>();
	private JLabel label_commande = new JLabel("Si vous voulez commander une quiche de votre hisorique,");
	private JLabel label_commande2 = new JLabel("sélectionnez-là et appuyez sur le bouton commander");
	private JButton bouton_commande = new JButton("Commander cette quiche");
	private JLabel label_note = new JLabel("Si vous voulez noter une quiche de votre hisorique,");
	private JLabel label_note2 = new JLabel("sélectionnez-là et appuyez sur le bouton noter");
	private JButton bouton_note = new JButton("Noter et commenter cette quiche");

	public FenetreHisto() {
		this.setTitle("QuicH'24 : Historique");
		this.setSize(400,600);
		this.setResizable(false);
		panel_histo.setLayout(null); //On decide de placer chaque élement avec sa position en pixels
	
		// ajout des differents composants de connexion sur le layout
		panel_histo.add(label_historique);
		label_historique.setBounds(15,20,300,20);
		panel_histo.add(liste_commandes);
		liste_commandes.setBounds(15,45,200,150);
		panel_histo.add(label_commande);
		label_commande.setBounds(15,200,350,20);
		panel_histo.add(label_commande2);
		label_commande2.setBounds(15,220,350,20);
		panel_histo.add(bouton_commande);
		bouton_commande.setBounds(20,250,250,20);
		panel_histo.add(label_note);
		label_note.setBounds(15,280,350,20);
		panel_histo.add(label_note2);
		label_note2.setBounds(15,300,350,20);
		panel_histo.add(bouton_note);
		bouton_note.setBounds(20,325,250,20);
		
		bouton_note.addActionListener(this);
		bouton_commande.addActionListener(this);

		
		this.setContentPane(panel_histo);
		this.setVisible(true);
	}
		public void actionPerformed(ActionEvent touche) {
			Object source = touche.getSource();
			
			if (source==bouton_note){
				FenetreNote fennote = new FenetreNote();
			}
			if (source==bouton_commande){
				
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