package classe_métier;

public class Medecin extends Personne {

	private String numAgrement;
	private String spécialité;
	
	public Medecin(String nom, String prenom, int numeroRue, String nomRue, String ville, int codePostal, int téléphone,
			String email, String numAgrement, String spécialité) {
		super(nom, prenom, numeroRue, nomRue, ville, codePostal, téléphone, email);
		this.numAgrement = numAgrement;
		this.spécialité = spécialité;
	}

	public String getNumAgrement() {
		return numAgrement;
	}

	public String getSpécialité() {
		return spécialité;
	}

	
}
