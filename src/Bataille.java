import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cr�ation des deux joueurs et du paquet
		Joueur Sam = new Joueur("Sam");
		Joueur Chris = new Joueur("Chris");
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		
		// cr�ation du paquet de cartes
		
			// pour chaque couleur possible
			for (int j=0; j<Carte.tabCouleurs.length; j++) {
				//pour chaque valeur possible
				for (int k=0; k<Carte.tabValeurs.length; k++) {
					Carte uneCarte = new Carte(Carte.tabCouleurs[j], Carte.tabValeurs[k]);
					paquet.add(uneCarte);
				}
			}
			
			// m�lange du paquet
			Collections.shuffle(paquet);
			
			// affichage du paquet
			/*for (int i=0; i<paquet.size(); i++) {
				System.out.println(paquet.get(i));
			}*/
			
			// r�partition du paquet entre les deux joueurs
			for (int l=0; l<paquet.size(); l=l+2) {
				Sam.tireCarte(paquet.get(l));
				Chris.tireCarte(paquet.get(l+1));
				
				//System.out.println(Sam.getMain());
			}
			
			// d�but du jeu
			int plus = 1;
			for (int m=Sam.getMain().size(); m>0; m--) {
				int result = Sam.getMain().get(m-1).compare(Chris.getMain().get(m-1));
				
				switch (result) {
				case 1:
					Sam.setPoints(plus);
					System.out.println("Sam remporte la manche");
					break;
				case 2:
					Chris.setPoints(plus);
					System.out.println("Chris remporte la manche");
					break;
				default:
					System.out.println("Egalit�");
				}
				
				System.out.println("Sam a "+Sam.getPoints()+" points");
				System.out.println("Chris a "+Chris.getPoints()+" points");
			}
				// comptage des points
				if (Sam.getPoints() > Chris.getPoints())
					System.out.println("Sam est le gagnant !");
				else
					System.out.println("Chris est le gagnant !");
	}

}
