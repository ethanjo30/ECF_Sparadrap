package classe_métier;

public class Medicament {

	private String nomMedi;
	private int prix;
	private String dateMiseService;
	private int quantité;
	
	public Medicament(String nom, int prix, String dateMiseService, int quantité) {
		super();
		this.nomMedi = nom;
		this.prix = prix;
		this.dateMiseService = dateMiseService;
		this.quantité = quantité;
	}

	public String getNom() {
		return nomMedi;
	}

	public int getPrix() {
		return prix;
	}

	public String getDateMiseService() {
		return dateMiseService;
	}

	public int getQuantité() {
		return quantité;
	}
	
}
