package classe_métier;

import java.util.ArrayList;

public class Historique {
	
	private String nom;
	private ArrayList<Medicament> nomMedi;
	private int somme;
	private String Mut;
	
	public Historique(String string, ArrayList<Medicament> nomMedi, int somme) {
		super();
		this.nom = string;
		this.nomMedi = nomMedi;
		this.somme = somme;
	}

	public Historique(String nom, ArrayList<Medicament> nomMedi, int somme, String mut) {
		super();
		this.nom = nom;
		this.nomMedi = nomMedi;
		this.somme = somme;
		Mut = mut;
	}

	public String getNom() {
		return nom;
	}

}
