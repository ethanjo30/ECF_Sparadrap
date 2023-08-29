package classe_métier;

public class ordonance {

	private int date;
	private Medecin generaliste;
	private Specialiste specialiste;
	private Patients patient;
	private Medicament med;
	
	public ordonance(int date, Medecin generaliste, Specialiste specialiste, Patients patient, Medicament med) {
		super();
		this.date = date;
		this.generaliste = generaliste;
		this.specialiste = specialiste;
		this.patient = patient;
		this.med = med;
	}
	
	
}
