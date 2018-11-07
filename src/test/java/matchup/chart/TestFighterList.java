package matchup.chart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TestFighterList {

	@Test
	void testIfFighterListObjectIsCreatedSuccessfully() {
		FighterList fighterList = new FighterList();
		assertThat(fighterList).isInstanceOf(FighterList.class);
	}

}
