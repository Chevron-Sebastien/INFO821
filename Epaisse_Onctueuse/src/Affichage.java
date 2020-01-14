import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class Affichage extends JFrame implements ActionListener,WindowListener  {

private JPanel panel_choix = new JPanel();
private JPanel panel_ingredient = new JPanel();
private JLabel label_bienvenue = new JLabel("Bienvenue sur QuicH'24 !!!");
private JLabel label_recettes_possibles = new JLabel("Choissisez votre recettes de base :");
private JComboBox<Quiche> liste_deroulante_recettes = new JComboBox<Quiche>();
private JButton validation_recettes_bases = new JButton("Valider recette");

private JLabel label_ingredients = new JLabel("Choissisez les ingrédients de votre quiche :");
private JLabel label_ingredients_dispo = new JLabel("Ingrédients disponibles :");
private JLabel label_ingredients_choisi = new JLabel("Ingrédients choisis :");
private DefaultListModel liste_ingred = new DefaultListModel();
private DefaultListModel liste_ingred_non = new DefaultListModel();
private JList<Ingred> liste_ingredients_dispo = new JList<Ingred>();
private JList<Ingred> liste_ingredients_choisi = new JList<Ingred>();
private JButton ajout = new JButton("+");
private JButton retrait = new JButton("-");
private JButton validation_finale = new JButton("Acheter cette Quiche !!!");
private Quiche q;


protected Commande C;
private Ingred listModel;

	public Affichage(Commande c){
		this.C=c;
		this.setTitle("QuicH'24");
		this.setSize(400,400);
		this.setResizable(false);
		
		//Initialisation liste ingrédients
		for (int i = 0; i<C.listRecette.size(); i++){
			liste_deroulante_recettes.addItem(C.listRecette.get(i));
		}
		panel_choix.setLayout(null); //On decide de placer chaque élement avec sa position en pixels
		
		panel_choix.add(label_bienvenue);
		label_bienvenue.setFont(new Font("CooperBlack", Font.BOLD, 20));
		label_bienvenue.setBounds(70,40,300,20);
		//Ajout texte : Choissisez votre recettes de base :
		panel_choix.add(label_recettes_possibles);
		label_recettes_possibles.setBounds(20,90,200,20);
		//Ajout liste déroulante
		panel_choix.add(liste_deroulante_recettes);
		liste_deroulante_recettes.setBounds(230,90,150,25);
		//Ajout bouton de validation
		panel_choix.add(validation_recettes_bases);//validation recette vide la quicheclient de tous les ingrédients
		validation_recettes_bases.setBounds(100,200,200,50);
		validation_recettes_bases.addActionListener(this); //Ajout du bouton au listener
		
		

		
		
		

		
		
		
		this.setContentPane(panel_choix);
		this.setVisible(true);
	}
	//A chaque action, cette fonction s'éxecute avec en paramètre le bouton qui à été appuyé
	public void actionPerformed(ActionEvent touche) {
		Object source = touche.getSource();
			if (source==validation_recettes_bases){ //Si on appuie sur le bouton de validation de la recette
				this.setVisible(false);
				C.createQuicheClient((Quiche)liste_deroulante_recettes.getSelectedItem());
				q=((Quiche)liste_deroulante_recettes.getSelectedItem());
				liste_ingredients_choisi.setModel(liste_ingred);
				liste_ingredients_dispo.setModel(liste_ingred_non);
				
				for (int i=0;i<C.listIngred.size();i++){
					liste_ingred_non.addElement(C.listIngred.get(i));
				}
				
				for (int i=0;i<C.QC.ingredClient.size();i++){
					liste_ingred_non.removeElement(C.QC.ingredClient.get(i));
					liste_ingred.addElement(C.QC.ingredClient.get(i));
				}
				

				//remplir les listes d'ingrédients
				
				//Affichage de l'ensemble des données pour le choix des ingrédients
				panel_ingredient.setLayout(null);
				panel_ingredient.add(label_ingredients);
				label_ingredients.setBounds(20,20,300,20);
				
				panel_ingredient.add(label_ingredients_dispo);
				label_ingredients_dispo.setBounds(20,90,150,20);
				
				panel_ingredient.add(label_ingredients_choisi);
				label_ingredients_choisi.setBounds(230,90,150,20);
				
				panel_ingredient.add(liste_ingredients_dispo);
				liste_ingredients_dispo.setBounds(20,110,150,200);
				panel_ingredient.add(liste_ingredients_choisi);
				liste_ingredients_choisi.setBounds(230,110,150,200);
				panel_ingredient.add(ajout);
				ajout.setBounds(175,200,50,20);
				ajout.addActionListener(this); //Ajout du bouton au listener
				panel_ingredient.add(retrait);
				retrait.setBounds(175,230,50,20);
				retrait.addActionListener(this); //Ajout du bouton au listener
				panel_ingredient.add(validation_finale);
				validation_finale.setBounds(80,320,200,50);
				validation_finale.addActionListener(this); //Ajout du bouton au listener
				
				this.setContentPane(panel_ingredient);
				this.setVisible(true);
			}
			if (source==ajout){
				liste_ingred.addElement(liste_ingredients_dispo.getSelectedValue());
				liste_ingred_non.removeElement(liste_ingredients_dispo.getSelectedValue());

			}
			if (source==retrait){
				liste_ingred_non.addElement(liste_ingredients_choisi.getSelectedValue());
				liste_ingred.removeElement(liste_ingredients_choisi.getSelectedValue());
			}
			
			if(source==validation_finale){
				C.QC.AffichageIngred();
				System.out.println("YO");
				C.QC.removeAll();
				System.out.println("YO");
				C.QC.AffichageIngred();
				for(int i=0;i<liste_ingred.size();i++){
					C.QC.addIngred((Ingred)liste_ingred.getElementAt(i));
				}
				C.QC.AffichageIngred();
				FenetreCommande fencom = new FenetreCommande();
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

