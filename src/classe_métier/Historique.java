package classe_métier;

import java.util.ArrayList;

public class Historique {
	
	private Patients nom;
	private ArrayList<Medicament> nomMedi;
	private int somme;
	
	public Historique(Patients nom, ArrayList<Medicament> nomMedi, int somme) {
		super();
		this.nom = nom;
		this.nomMedi = nomMedi;
		this.somme = somme;
	}

	public String toString() {
		return " \n nom patient : " + nom + "\n medicament selectionné : " +  nomMedi + "\n net a payer : " + somme ;
	}

	
}
