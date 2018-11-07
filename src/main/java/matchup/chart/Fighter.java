package matchup.chart;

public class Fighter {
	
	private int fighterId;
	private String fighterName;
	private double winPercentage;
	
	Fighter(int id, String fighterName, double winPercentage) {
		setId(id);
		setFighterName(fighterName);
		setWinPercentage(winPercentage);
	}
	
	public void setId(int fighterId) {
		this.fighterId = fighterId;
	}
	
	public void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}

	public void setWinPercentage(double winPercentage) {
		this.winPercentage = winPercentage;
	}
	
	public int getFighterId() {
		return fighterId;
	}
	
	public String getFighterName() {
		return fighterName;
	}
	
	public double getWinPercentage() {
		return winPercentage;
	}
	
	public String getFighterInfo() {
		System.out.println("[Fighter] \n" + "Fighter ID =" + getFighterId() + "\n" + "Fighter Name = " + getFighterName() + "\n" + "Win Percentage = " + getWinPercentage());
		return "[Fighter] \n" + "Fighter ID = " + getFighterId() + "\n" + "Fighter Name = " + getFighterName() + "\n" + "Win Percentage = " + getWinPercentage();
	}
	
}
