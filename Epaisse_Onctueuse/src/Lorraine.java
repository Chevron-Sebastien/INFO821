import java.util.ArrayList;


public class Lorraine extends Quiche {
	
	protected ArrayList<Ingred> ingredQuiche;
	private ArrayList<String> ingred;
	private String name = "Lorraine";
	
	
	
	public Lorraine(Commande C) {	//Constructeur
		ingred = new ArrayList<String>();
		ingredQuiche = new ArrayList<Ingred>();
		this.ingred.add("Poivron");
		this.ingred.add("Lardon");
		this.ingred.add("Oeuf");
		this.ingred.add("Pâte");
		for(int i=0;i<C.listIngred.size();i++){
			for(int j=0;j<this.ingred.size();j++){
				if (C.listIngred.get(i).getString()==(this.ingred.get(j))){
					this.ingredQuiche.add(C.listIngred.get(i));
				}
			}
		}
		C.addRecette(this);

	}
	public ArrayList<Ingred> getIngred(){
		return(ingredQuiche);
	}
	
	
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	void lancerPrep() {
		// TODO Auto-generated method stub
	}

	@Override
	void recapIngred() {
		
	}
}
