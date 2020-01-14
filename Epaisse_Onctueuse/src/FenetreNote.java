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

public class FenetreNote extends JFrame implements ActionListener,WindowListener{
	private JPanel panel_note = new JPanel(); 
	private JLabel label_selection = new JLabel("Vous avez choisi de noter cette quiche :");
	private JLabel label_note = new JLabel("Donnez une note sur 10 :");
	private JTextField label_note2 = new JTextField();
	private JLabel label_comm = new JLabel("Ecrivez votre commentaire :");
	private JTextField label_comm2 = new JTextField();
	private JButton bouton_envoyer = new JButton("Aperçu");
	private JLabel label_apercu = new JLabel("Aperçu de votre commentaire :");
	private JLabel label_apercu2 = new JLabel();
	private JButton bouton_publier = new JButton("Publier");

	public FenetreNote() {
		this.setTitle("QuicH'24 : Notes et commentaires");
		this.setSize(400,600);
		this.setResizable(false);
		panel_note.setLayout(null); //On decide de placer chaque élement avec sa position en pixels
	
		// ajout des differents composants de connexion sur le layout
		panel_note.add(label_selection);
		label_selection.setBounds(15,20,300,20);
		panel_note.add(label_note);
		label_note.setBounds(15,50,300,20);
		panel_note.add(label_note2);
		label_note2.setBounds(15,70,300,20);
		panel_note.add(label_comm);
		label_comm.setBounds(15,95,300,20);
		panel_note.add(label_comm2);
		label_comm2.setBounds(15,115,300,20);
		panel_note.add(bouton_envoyer);
		bouton_envoyer.setBounds(15,140,200,20);
		panel_note.add(label_apercu);
		label_apercu.setBounds(15,170,200,20);

		panel_note.add(bouton_publier);
		bouton_publier.setBounds(15,235,200,20);
		
		this.setContentPane(panel_note);
		this.setVisible(true);
		
		
		bouton_envoyer.addActionListener(this);
		bouton_publier.addActionListener(this);

	}
//label_note2.getText()+"/10 : " + label_comm2.getText()
	public void actionPerformed(ActionEvent touche) {
		Object source = touche.getSource();
		if (source==bouton_envoyer){
			label_apercu2.setText(label_note2.getText()+"/10 : " + label_comm2.getText());
			label_apercu2.setBounds(15,200,400,20);
			panel_note.add(label_apercu2);
			this.setContentPane(panel_note);
			this.setVisible(true);
		}
		
		if (source==bouton_publier){
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
