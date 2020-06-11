package antimonopoly.entities;
import java.util.ArrayList;
import java.util.List;

public class Plateau {
	List<Case> cases = new ArrayList<Case> ();
	
	
	public Plateau(String string) {
	}

	public List<Case> getCases() {
		return cases;
	}
	
	public void addCase(Case case1) {
		cases.add(case1);

	}
}
	