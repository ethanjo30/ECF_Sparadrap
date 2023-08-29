package classe_métier;

public class Medicament {

	private String nom;
	private int prix;
	private int dateMiseService;
	private int quantité;
	
	public Medicament(String nom, int prix, int dateMiseService, int quantité) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateMiseService = dateMiseService;
		this.quantité = quantité;
	}
	
}
