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

public class FenetreProfil extends JFrame implements ActionListener,WindowListener {
	//creation de la page de connexion au profil
	private JPanel panel_profil = new JPanel(); 
	private JLabel label_connexion = new JLabel("Rentrez votre identifiant :");
	private JTextField label_identifiant = new JTextField();
	private JLabel label_connexion2 = new JLabel("et votre mot de passe :");
	private JTextField label_mdp = new JTextField();
	private JButton bouton_connexion = new JButton("Se connecter");
	private JLabel label_creation_compte = new JLabel("Si vous n'en avez pas, créer votre profil :");
	private JButton bouton_creation = new JButton("Créer un profil");
	private JLabel label_connecte = new JLabel("");
	private JLabel label_cree = new JLabel("");
	protected Affichage a;
// ajouter "utilisateur connecté" ou "profil créé" en fonction de quel bouton on clique et si les champs sont remplis
	
// quand il ya connexion, afficher historique
	
	public FenetreProfil() {
		this.setTitle("QuicH'24 : Profil");
		this.setSize(400,600);
		this.setResizable(false);
		panel_profil.setLayout(null); //On decide de placer chaque élement avec sa position en pixels
		
		// ajout des differents composants de connexion sur le layout
		panel_profil.add(label_connexion);
		label_connexion.setBounds(15,20,200,20);
		panel_profil.add(label_identifiant);
		label_identifiant.setBounds(15,45,200,20);
		panel_profil.add(label_connexion2);
		label_connexion2.setBounds(15,70,200,20);
		panel_profil.add(label_mdp);
		label_mdp.setBounds(15,95,200,20);
		panel_profil.add(bouton_connexion);
		bouton_connexion.setBounds(250,50,130,50);
		panel_profil.add(label_creation_compte);
		label_creation_compte.setBounds(15,120,300,20);
		panel_profil.add(bouton_creation);
		bouton_creation.setBounds(250,120,130,25);
		panel_profil.add(label_connecte);
		panel_profil.add(label_cree);
		label_connecte.setBounds(15,145,200,20);
		label_cree.setBounds(15,145,200,20);
		
		this.setContentPane(panel_profil);
		this.setVisible(true);
		
		bouton_connexion.addActionListener(this);
		bouton_creation.addActionListener(this);
	}

// affichage texte avec appui des boutons
		
//		bouton_connexion.addActionListener(new BListener());
//	    bouton_creation.addActionListener(new B2Listener());
//	    class BListener implements ActionListener{
//	      public void actionPerformed(ActionEvent arg0) {
//	    	  label_connecte.setText("Vous êtes connecté à votre profil");        
//	      }
//	    }
//	    class B2Listener implements ActionListener{
//	      public void actionPerformed(ActionEvent e) {
//	    	  label_cree.setText("Vous avez créé votre profil");    
//	      }
//	    }      
	  
		public void actionPerformed(ActionEvent touche) {
			Object source = touche.getSource();
			
			if (source==bouton_creation|source==bouton_connexion){
				FenetreHisto fenhist = new FenetreHisto();
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
