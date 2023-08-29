package classe_métier;

public class Pharmacien extends Personne {

	private int id;

	public Pharmacien(String nom, String prenom, int id) {
		super( nom, prenom);
		this.id = id;
	}
	
}
