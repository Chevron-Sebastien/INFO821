import java.awt.List;
import java.util.ArrayList;

public class Commande {
	protected ArrayList<Quiche> listRecette;
	protected ArrayList<Ingred> listIngred;
	protected QuicheClient QC;
	
	public Commande(){
		this.listRecette = new ArrayList<Quiche>();
		this.listIngred = new ArrayList<Ingred>();
	}
	
	public void addIngred(Ingred x) {	//Ajout d'ingredient a la liste, quantité set a 1
		this.listIngred.add(x);

	}
	
	public void createQuicheClient(Quiche Quiche){
		this.QC = new QuicheClient(Quiche);
		
	}
	
	public void recapCommande(){
		
	}
	
	public void addRecette(Quiche recette){
		this.listRecette.add(recette);
	}
	
}
