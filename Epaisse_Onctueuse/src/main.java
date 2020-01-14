import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		Commande C = new Commande();
		
		Ingred Pate = new Ingred("Pâte");
		C.addIngred(Pate);
		Ingred Oeuf = new Ingred("Oeuf");
		C.addIngred(Oeuf);
		Ingred Poivron = new Ingred("Poivron");
		C.addIngred(Poivron);
		Ingred Lardon = new Ingred("Lardon");
		C.addIngred(Lardon);
		Ingred Concombre = new Ingred("Concombre");
		C.addIngred(Concombre);
		
		Lorraine l = new Lorraine(C);
		Vegetarien v = new Vegetarien(C);
		
		FenetreProfil fen = new FenetreProfil();
		Affichage fen2 = new Affichage(C);
		
		
		


	}
	
	
	

}
