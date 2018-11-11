package matchup.chart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
		Fighter[] fightersToAdd = new Fighter[] {new Fighter(6, "King Dedede", 58.90), new Fighter(2, "King K.Rool", 52.50), new Fighter(3, "Donkey Kong", 55.50)};
		FighterList fighterList = new FighterList();
		fighterList.addAllFightersToList(fightersToAdd);
		fighterList.printListOfFighters();
	}
	
	@Test
	void testSortFightersOnWinRate() {
		Fighter[] fightersToAdd = new Fighter[] {new Fighter(6, "King Dedede", 58.90), new Fighter(2, "King K.Rool", 52.50), new Fighter(3, "Donkey Kong", 55.50), new Fighter(4, "Bowser", 59.2)};
		FighterList fighterList = new FighterList();
		fighterList.addAllFightersToList(fightersToAdd);
		fighterList.sortFightersOnWinRate();
		assertThat(fighterList.getFighters().get(0).getFighterName()).isEqualTo("Bowser");
	}

}
