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
	
	@Test
	void testIfFighterAddedToFighterList() {
		Fighter kingDedede = new Fighter(1, "King Dedede", 51.90);
		FighterList fighterList = new FighterList();
		fighterList.addFighterToList(kingDedede);
		assertThat(fighterList.getFighters()).contains(kingDedede);
	}
	
	@Test
	void testPrintListOfFighters() {
		Fighter kingDedede = new Fighter(1, "King Dedede", 51.90);
		Fighter kingKRool = new Fighter(2, "King K.Rool", 52.50);
		FighterList fighterList = new FighterList();
		fighterList.addFighterToList(kingDedede);
		fighterList.addFighterToList(kingKRool);
		fighterList.getListOfFighters();
	}

}
