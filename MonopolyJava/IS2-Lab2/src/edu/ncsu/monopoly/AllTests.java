package edu.ncsu.monopoly;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CardsTest.class, CellInfoFormatterTest.class, GainMoneyCardTest.class, GameboardCreationTest.class,
		GameboardTest.class, GameMasterTest.class, GoToJailCardTest.class, LoseMoneyCardTest.class,
		MovePlayerCardTest.class, PlayerTest.class, PropertyCellTest.class, RailRoadCellTest.class, TradeDealTest.class,
		UtilityCellTest.class })
public class AllTests {

}
