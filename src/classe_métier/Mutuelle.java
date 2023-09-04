package classe_métier;

public class Mutuelle extends Personne{
	
	private int departement;
	private int tauxPriseEnCharge;
	
	public int getTauxPriseEnCharge() {
		return tauxPriseEnCharge;
	}

	public Mutuelle(String nom, int numeroRue, String nomRue, String ville, int codePostal, int téléphone, String email,
			int departement, int tauxPriseEnCharge) {
		super(nom, numeroRue, nomRue, ville, codePostal, téléphone, email);
		this.departement = departement;
		this.tauxPriseEnCharge = tauxPriseEnCharge;
	}

}