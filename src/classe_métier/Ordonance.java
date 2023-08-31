package classe_métier;

import java.awt.Component;

public class Ordonance {

	private String date;
	private String nomMed;
	private String prenomMed;
	private String nomPat;
	private String PrenomPat;
	private String med1;
	private String med2;
	private String med3;
	private String med4;
	
	public Ordonance(String date, String nomMed, String prenomMed, String nomPat,String PrenomPat, String med1, String med2, String med3,
			String med4) {
		super();
		this.date = date;
		this.nomMed = nomMed;
		this.prenomMed = prenomMed;
		this.nomPat = nomPat;
		this.PrenomPat = PrenomPat;
		this.med1 = med1;
		this.med2 = med2;
		this.med3 = med3;
		this.med4 = med4;
	}
	 
	public String getDate() {
		return date;
	}

	public String getNomMed() {
		return nomMed;
	}

	public String getPrenomMed() {
		return prenomMed;
	}

	public String getNomPat() {
		return nomPat;
	}
	
	public String getPrenomPat() {
		return PrenomPat;
	}

	public String getMed1() {
		return med1;
	}

	public String getMed2() {
		return med2;
	}

	public String getMed3() {
		return med3;
	}

	public String getMed4() {
		return med4;
	}

	public String identité() {
		return nomMed + " " + prenomMed;
	}

	@Override
	public String toString() {
		return date + nomMed + prenomMed + nomPat + PrenomPat+ med1 + med2 + med3 + med4;	
	}
	
	
}

