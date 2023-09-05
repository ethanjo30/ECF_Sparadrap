package classe_métier;

import java.util.ArrayList;

public class Historique1 {
	
	private String nom;
	private ArrayList<Medicament> nomMedi;
	private int somme;
	private String Mut;
	
	public Historique1(String string, ArrayList<Medicament> nomMedi, int somme) {
		super();
		this.nom = string;
		this.nomMedi = nomMedi;
		this.somme = somme;
	}

	public Historique1(String nom, ArrayList<Medicament> nomMedi, int somme, String mut) {
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
