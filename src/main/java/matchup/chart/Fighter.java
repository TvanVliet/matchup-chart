package matchup.chart;

public class Fighter {
	
	private int fighterId;
	private String fighterName;
	
	public Fighter(int id, String fighterName) {
		this.fighterId = id;
		this.fighterName = fighterName;
	}
	
	void setId(int fighterId) {
		this.fighterId = fighterId;
	}
	
	void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}
	
}
