package classe_métier;

public class Mutuelle extends Personne{
	
	private String departement;
	private int tauxPriseEnCharge;
	
	public Mutuelle(String nom, String prenom, int numeroRue, String nomRue, String ville, int codePostal,
			int téléphone, String email, String departement, int tauxPriseEnCharge) {
		super(nom, prenom, numeroRue, nomRue, ville, codePostal, téléphone, email);
		this.departement = departement;
		this.tauxPriseEnCharge = tauxPriseEnCharge;
	}
	

	


}