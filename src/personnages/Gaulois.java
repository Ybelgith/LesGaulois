/**
 * 
 */
package personnages;

/**
 * @author BLS4301A
 *
 */

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
//		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
//			this.trophees[nb_trophees] = trophees[i];
//		}
//		return;
//	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);

		Romain césar = new Romain("César", 6);
		// Test de la méthode parler
		asterix.parler("Je suis Astérix, le plus malin des Gaulois !");

		// Test de la méthode frapper
		asterix.frapper(césar);

		// Affichage pour vérifier la création de l'objet
		// System.out.println(asterix);
		// TODO créer un main permettant de tester la classe Gaulois
	}
}
