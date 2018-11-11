package matchup.chart;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFighter {

	@Test
	void testIfFighterObjectIsCreatedSuccessfully() {
		Fighter kingDedede = new Fighter(1, "King Dedede", 51.90);
		assertThat(kingDedede).isInstanceOf(Fighter.class);
	}
	
	@Test
	void testGetWinPercentageOfAFighter() {
		Fighter kingDedede = new Fighter(1, "King Dedede", 51.90);
		assertThat(kingDedede.getWinPercentage()).isEqualTo(51.90);
	}
	
	@Test
	void testPrintFighterInfo() {
		Fighter kingKRool = new Fighter(2, "King K.Rool", 52.50);
		kingKRool.getFighterInfo();
		assertThat(kingKRool.getFighterId()).isEqualTo(2);
	}
	
}
