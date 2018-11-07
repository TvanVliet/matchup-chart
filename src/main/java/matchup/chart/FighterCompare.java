package matchup.chart;

import java.util.Comparator;

public class FighterCompare implements Comparator<Fighter> {

	@Override
	public int compare(Fighter fighter1, Fighter fighter2) {
		int fighter1Id = fighter1.getFighterId();
		int fighter2Id = fighter2.getFighterId();
		
		return fighter1Id - fighter2Id;

	}

}
