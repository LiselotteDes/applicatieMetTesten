package be.vdab.valueobjects;
// Importeert de package org.junit, niet de oudere package junit.framework.
//import org.junit.Assert;
// Importeert de static methods assertTrue en assertFalse van de Assert class
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/*
 * Een unit test is een public class met een vrij te kiezen naam.
 * De conventie is dat de naam gelijk is aan de te testen class, gevolgd door Test.
 */
public class JaarTest {
	/*
	 * Een test is één method waarbij je @Test schrijft (een @Test method).
	 * Een @Test method is public, heeft als returntype void en heeft geen parameters.
	 * Je kan de naam vrij kiezen. Het is aan te raden dat die aangeeft wat je gaat testen. 
	 */
	@Test
	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
		/*
		 * Maakt een object van de te testen class. 
		 * Je zorgt ervoor dat dit object in de toestand komt die je wilt testen.
		 * Je gebruikt een voorbeeldwaarde (400) die past bij de test.
		 * Je vindt zo'n waarde in de analyse, in documenten, op het internet, of je bedenkt zelf een waarde.
		 * Deze waarde is hard gecodeerd.
		 * Het is niet de bedoeling dat je de waarde instelt met berekeningen of algoritmes. 
		 * Er is dan kans op denkfouten.
		 * Een foute test kan de werking van de gewone class nooit correct testen !
		 */
//		Jaar jaar = new Jaar(2000);
		/*
		 * Voert isSchrikkeljaar uit. Als deze method correct is, geeft ze true.
		 * De JUnit class Assert bevat static methods waarmee je dit controleert.
		 * Je geeft aan assertEquals 2 waarden mee: de waarde die je verwacht (true)
		 * en de echte waarde die je krijgt bij de method oproep.
		 * Als de waarden aan mekaar gelijk zijn, aanziet JUnit de test als correct verlopen. 
		 * Anders is de test mislukt.
		 */
//		Assert.assertEquals(true, jaar.isSchrikkeljaar());
		// korter schrijven met assertTrue en assertFalse
//		Assert.assertTrue(new Jaar(2000).isSchrikkeljaar());
		assertTrue(new Jaar(2000).isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
//		Assert.assertEquals(false, new Jaar(1900).isSchrikkeljaar());
//		Assert.assertFalse(new Jaar(1990).isSchrikkeljaar());
		assertFalse(new Jaar(1990).isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
//		Assert.assertEquals(true, new Jaar(2012).isSchrikkeljaar());
//		Assert.assertTrue(new Jaar(2012).isSchrikkeljaar());
		assertTrue(new Jaar(2012).isSchrikkeljaar());
	}
	@Test
	public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
//		Assert.assertEquals(false, new Jaar(2015).isSchrikkeljaar());
//		Assert.assertFalse(new Jaar(2015).isSchrikkeljaar());
		assertFalse(new Jaar(2015).isSchrikkeljaar());
	}
}
