import java.util.ArrayList;

public class Joueur {
	
	// les attributs
	private String nom;
	private int points;
	private ArrayList<Carte> main = new ArrayList<Carte>();
	
	// le constructeur
	public Joueur(String nom){
		this.nom = nom;
	}
	
	// les accesseurs
	public int getPoints() {
		return this.points;
	}
	
	public void setPoints(int points) {
		this.points += points;
	}
	
	public ArrayList<Carte> getMain() {
		return main;
	}
	
	// les méthodes
	public void tireCarte(Carte carte) {
		main.add(carte);
	}
	
	public void joueCarte(Carte carte) {
		main.remove(carte);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
