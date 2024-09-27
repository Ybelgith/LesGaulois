package personnages;

public class Village {
	
	private String nom;
	public Village(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	private Gaulois[] villageois; // Tableau de Gaulois
    private int nbVillageois = 0;  // Nombre de villageois initialisé à 0

    // Constructeur qui initialise le tableau villageois avec une capacité donnée
    public Village(int capacite) {
        villageois = new Gaulois[capacite];  // Initialisation du tableau avec la taille maximale
    }

    public void ajouterHabitant(Gaulois gaulois) {
    	if (nbVillageois < villageois.length) {  // Vérifie s'il y a encore de la place dans le tableau
    		villageois[nbVillageois] = gaulois;  // Place le gaulois dans le tableau
    		nbVillageois++;  // Incrémente le nombre de villageois
    	} else {
    		System.out.println("Le village est plein, impossible d'ajouter un nouveau villageois !");
    	}
    }
    	
    public Gaulois trouverHabitant (int id) {
    	if (id >= 0 && id < nbVillageois ) {
    		return villageois[id];
    	} 
    		else {
            System.out.println("Numéro de villageois invalide !");
            return null;
        }
    	
    }
    public static void main(String[] args) {
        Village village = new Village(5); // Village avec capacité de 5 villageois
        
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 10);
        
        // Ajout des Gaulois au village
        village.ajouterHabitant(asterix);
        village.ajouterHabitant(obelix);
        //TP2
        // Test d'ajout au-delà de la capacité maximale (si plus de 5 villageois sont ajoutés)
    }

}


