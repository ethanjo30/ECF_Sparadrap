package testpharma;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classe_métier.Medecin;
import classe_métier.Mutuelle;
import classe_métier.Ordonance;
import classe_métier.Patients;

class test {

	@Test
	void test_patients() {
		
		Patients pat = new Patients("Martin","Pierre",123,"rue de la Fictivité","Paris",75000,603487571,
				"Martin.Pierre@gmail.com","01/01/1997","197017512348622");
		
		assertEquals("Martin", pat.getNom());
		assertEquals("Pierre", pat.getPrenom());
		assertEquals("01/01/1997", pat.getDateNaisssance());
		assertEquals("197017512348622", pat.getNumSecu());
		
	}
	void test_medecin() {
		
		Medecin med = new Medecin ("Gallet","Anne",11,"place de la nation","Paris",75011,622487594,
				"Gallet.Anne@gmail.com","10123456789","endocrinologue");
		
		assertEquals("Gallet", med.getNom());
		assertEquals("Anne",med.getPrenom());
		assertEquals("endocronologue",med.getSpécialité());
		assertEquals("10123456789",med.getNumAgrement());
	}
	
	void test_Mutuelle() {

		Mutuelle mut = new Mutuelle("Maaf", 975, "baudelmaire","havre",76600, 698598748,"maaf.serviceClients@gmail.com",76,100);
		
		assertEquals(76, mut.getDepartement());
		assertEquals(100, mut.getTauxPriseEnCharge());
	}
	
	void test_Ordonance() {
		
		Ordonance ordo = new Ordonance("03/001/22","Malka","Michel","Duvet","Honorine","Polymyxines","Diurétiques","Tétracyclines"," ");
		
		assertEquals("03/001/22", ordo.getDate());
		assertEquals("Malka", ordo.getNomMed());
		assertEquals("Michel", ordo.getPrenomMed());
		assertEquals("Duvet", ordo.getNomPat());
		assertEquals("Honorine", ordo.getPrenomPat());
		assertEquals("Polymyxines", ordo.getMed1());
		assertEquals("Diurétiques", ordo.getMed2());
		assertEquals("Tétracyclines", ordo.getMed3());
		assertEquals(" ", ordo.getMed4());
		
	}
}
