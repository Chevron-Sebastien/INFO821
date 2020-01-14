import java.util.ArrayList;

public class Ingred {

private String nom;

	public Ingred(String n) {
		this.nom=n;
	}
	
	public String getString(){
		return(this.nom);
	}

	@Override
	public String toString() {
		return nom;
	}
	
	

	

	
/*	public void retirIngred(String x) {
		for (int i = 0; i<this.listIngred.size(); i++)
			if(this.listIngred.get(i).equals(x)) {
				this.listIngred.remove(x);
			}
			else
			{
				System.out.println("attention, pas d'ingred a suppr");
			}
	}
	
	public void modifQuantite(String x) {	//Attention lors d'ajout de quantité ! modif a faire en fct de l'ingred choisit
		//this.listIngred.add(index, x);
	}
	
	public void recapitulationIngred() {
		for (int i = 0; i<this.listIngred.size(); i++) {
			System.out.println("Ingredient : " + this.listIngred.get(i) + "    Quantite : " + this.quantiteIngred.get(i));
		
		}

	}
*/
}
