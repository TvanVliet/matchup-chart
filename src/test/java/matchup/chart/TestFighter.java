package matchup.chart;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFighter {

	@Test
	void testIfFighterObjectIsCreatedSuccessfully() {
		Fighter kingDedede = new Fighter(1, "King Dedede");
		assertThat(kingDedede).isInstanceOf(Fighter.class);
	}
	
	

}
