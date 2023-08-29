package classe_métier;

public class Mutuelle extends Personne{
	
	private String departement;
	private int tauxPriseEnCharge;
	
	public Mutuelle(int numero_rue, String nom_rue, String ville, int codePostal, String nom,
			int téléphone, String email, String departement, int tauxPriseEnCharge) {
		super(numero_rue, nom_rue, ville, codePostal, nom, téléphone, email);
		this.departement = departement;
		this.tauxPriseEnCharge = tauxPriseEnCharge;
	}
	


}