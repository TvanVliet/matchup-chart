package matchup.chart;

import java.util.ArrayList;
import java.util.List;

public class FighterList {

	private List<Fighter> fighters = new ArrayList<>();

	public void addFighterToList(Fighter fighter) {
		fighters.add(fighter);
	}
	
	public List<Fighter> getFighters() {
		return fighters;
	}

	public void getListOfFighters() {
		for (Fighter fighter : fighters) {
			System.out.println("[Fighter] \n" + "Fighter ID = " + fighter.getFighterId() + "\n" + "Fighter Name = " + fighter.getFighterName() + "\n" + "Win Percentage = " + fighter.getWinPercentage() + "\n");
		}
	}

}


