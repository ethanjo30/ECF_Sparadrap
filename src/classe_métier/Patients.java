package classe_métier;

public class Patients extends Personne{
	
	private int dateNaisssance;
	private String numSecu;

	public Patients(String nom, String prenom, int numeroRue, String nomRue, String ville, int codePostal,
			int téléphone, String email, int dateNaisssance, String numSecu) {
		super(nom, prenom, numeroRue, nomRue, ville, codePostal, téléphone, email);
		this.dateNaisssance = dateNaisssance;
		this.numSecu = numSecu;
	}

}
