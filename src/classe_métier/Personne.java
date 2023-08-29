package classe_métier;

public class Personne {

	private String nom;
	private String prenom;
	private  int numeroRue;
	private  String nomRue;
	private  String ville;
	private  int codePostal;
	private int téléphone;
	private String email;

	public Personne(String nom, String prenom, int numeroRue, String nomRue, String ville, int codePostal,
			int téléphone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.téléphone = téléphone;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public Personne(String nom, int numeroRue, String nomRue, String ville, int codePostal, int téléphone,
			String email) {
		super();
		this.nom = nom;
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.téléphone = téléphone;
		this.email = email;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String identité() {
		return nom +" " +  prenom;
	}
	
}
