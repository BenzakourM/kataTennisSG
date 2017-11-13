package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Player;
import main.PlayerImpl;
import main.Set;

class SetUnitTest {
	private Player player1 = new PlayerImpl("player1");
	private Player player2 = new PlayerImpl("player2");
	private Set tennisSet = new Set(player1, player2);
	
	@Test
	void testPlayerOneWinTheFirstGame() {
		createSetScore(1, 0);
		assertEquals("Set score : 1/0", tennisSet.getScore());
	}
	
	@Test
	void testPlayerTwoWinTheFirstThreeGames() {
		createSetScore(0, 3);
		assertEquals("Set score : 0/3", tennisSet.getScore());
	}
	
	@Test
	void testPlayersWonFiveGamesEach() {
		createSetScore(5, 5);
		assertEquals("Set score : 5/5", tennisSet.getScore());
	}
	
	@Test
	void testPlayerOneWinsTheSet() {
		createSetScore(6, 3);
		assertEquals("Set score : player1 win the set and the match", tennisSet.getScore());
	}
	
	@Test
	void testPlayerTwoWinsTheSet() {
		createSetScore(5, 7);
		assertEquals("Set score : player2 win the set and the match", tennisSet.getScore());
	}
	
	@Test
	void testPlayerTwoWinsTheSetAfterTieBreak() {
		createSetScore(6, 7);
		assertEquals("Set score : player2 win the set and the match", tennisSet.getScore());
	}

	private void createSetScore(int setsWonByPlayerOne, int setsWonByPlayerTwo) {
		player1.setSetScore(setsWonByPlayerOne);
		player2.setSetScore(setsWonByPlayerTwo);
	}
}
