import java.util.ArrayList;


public class QuicheClient {

	private int prix;
	protected ArrayList<Ingred> ingredClient;
	
		public QuicheClient(Quiche Q){
			this.ingredClient = new ArrayList<Ingred>();
			this.ingredClient=Q.getIngred();
			
		}
		public void removeAll(){
			this.ingredClient.removeAll(ingredClient);
		}
		public void addIngred(Ingred I){

			this.ingredClient.add(I);
		}

		public void AffichageIngred(){
			for (int i=0;i<this.ingredClient.size();i++){
				System.out.println(this.ingredClient.get(i));
			}
		}
}
