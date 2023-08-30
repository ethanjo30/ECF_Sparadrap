package testpharma;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ClasseMetier.Livre;
import classe_métier.Patients;

class test {

	@Test
	void test_patients() {
		
		Patients pat = new Patients("Martin","Pierre",123,"rue de la Fictivité","Paris",75000,603487571,
				"Martin.Pierre@gmail.com","01/01/1997","197017512348622");
		
		assertEquals("Martin", pat.getNom());
		assertEquals("Pierre", pat.getPrenom());
		assertEquals(123, pat.getNumeroRue());		
		assertEquals("rue de la Fictivité", pat.getNomRue());
		assertEquals("Paris", pat.getVille());
		assertEquals(75000, pat.getCodePostal());
		assertEquals(603487571, pat.getTéléphone());
		assertEquals("Martin.Pierre@gmail.com", pat.getEmail());
		assertEquals("01/01/1997", pat.getDateNaisssance());
		assertEquals("197017512348622", pat.getNumSecu());
	}

}
