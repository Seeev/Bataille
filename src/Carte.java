
public class Carte {

	// les attributs
	public static String tabCouleurs[] = {"carreau", "coeur", "pique", "trefle"};
	public static int tabValeurs[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	private String couleur;
	private int valeur;
	
	
	// le constructeur
	public Carte(String c, int v) {
		this.couleur = c;
		this.valeur = v;
	}
	
	// les accesseurs
	public String getCouleur() {
		return this.couleur;
	}
	
	public int getValeur() {
		return this.valeur;
	}
	
	// les méthodes
	public int compare(Carte carte2) {
		if (this.valeur > carte2.getValeur())
			return 1;
		else if (this.valeur < carte2.getValeur())
			return 2;
		else
			return 0;
	}
	
	public String toString() {
		return this.valeur +" de "+this.couleur;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
