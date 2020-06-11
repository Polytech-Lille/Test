package antimonopoly.test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import antimonopoly.constructeur.CreateurDePlateau;
import antimonopoly.entities.Plateau;

public class TestPlateau {
	CreateurDePlateau constructeurDePlateaux;

	@Before
	public void setUp() {
		constructeurDePlateaux = new CreateurDePlateau();

	}

	@Test
	public void testPlateauCreeAvecDesCases() {

		Plateau plateau = constructeurDePlateaux.novueauPlateau();

		Assert.assertTrue("Le plateau est sense a etre cofigure", plateau.getCases().size() > 0);
	}
}