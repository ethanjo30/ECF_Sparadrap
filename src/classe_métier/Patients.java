package classe_métier;

import java.awt.Frame;

public class Patients extends Personne{
	
	private String dateNaisssance;
	private String numSecu;

	public Patients(String nom, String prenom, int numeroRue, String nomRue, String ville, int codePostal,
			int téléphone, String email, String dateNaisssance, String numSecu) {
		super(nom, prenom, numeroRue, nomRue, ville, codePostal, téléphone, email);
		this.dateNaisssance = dateNaisssance;
		this.numSecu = numSecu;
	}

	public String getDateNaisssance() {
		return dateNaisssance;
	}

	public String getNumSecu() {
		return numSecu;
	}
	
	public String toString() {
		return super.toString()+" "+"\n dateNaisssance : " + dateNaisssance + "\n numSecu : " + numSecu;
	}
}
