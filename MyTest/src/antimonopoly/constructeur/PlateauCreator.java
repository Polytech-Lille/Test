package antimonopoly.constructeur;

import antimonopoly.entities.Case;
import antimonopoly.entities.Plateau;

public class PlateauCreator {

	public Plateau novueauPlateau() {
		Plateau plateau = new Plateau();
		this.configurePlateauNeoLiberal(plateau);
		return plateau;
	}

	private void configurePlateauNeoLiberal(Plateau plateau) {
		plateau.addCase(new Case());
		plateau.addCase(new Case());
		plateau.addCase(new Case());
		
	}

}
