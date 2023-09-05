package classe_métier;

import java.util.ArrayList;

public class Historique {
	
	private String nom;
	private int somme;
	private String Mutu;
	
	public Historique(String nom, int somme, String mutu) {
		super();
		this.nom = nom;
		this.somme = somme;
		this.Mutu = mutu;
	}

	public Historique(String string, int somme) {
		super();
		this.nom = string;
		this.somme = somme;
	}

	public String getNom() {
		return nom;
	}
	
}
