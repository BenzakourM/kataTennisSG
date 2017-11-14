package com.katatennis.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.katatennis.Bean.Player;
import com.katatennis.Class.Game;

class GameUnitTest {

	private Player player1 = new Player("player1");
	private Player player2 = new Player("player2");
	private Game tennisGame = new Game(player1,player2);

	@Test
	void testGameScoreCorrectFromat() {
		
		String tennisScore = tennisGame.tennisScore(3);
		assertEquals("40", tennisScore);
		
		tennisScore = tennisGame.tennisScore(2);
		assertEquals("30", tennisScore);
		
		tennisScore = tennisGame.tennisScore(1);
		assertEquals("15", tennisScore);
		
		tennisScore = tennisGame.tennisScore(0);
		assertEquals("0", tennisScore);
	}
	
	@Test
	void testHasGameWinner() {
		createGameScore(4,2);
		assertEquals(true, tennisGame.hasWinner());
		
		createGameScore(4,4);
		assertEquals(false, tennisGame.hasWinner());
	}
	
	@Test
	void testPlayerWithHighestGameScore() {
		createGameScore(6,7);
		assertEquals(player2, tennisGame.playerWithHighestScore());
		
		createGameScore(5, 4);
		assertEquals(player1, tennisGame.playerWithHighestScore());
	}
	
	@Test
	void testPlayerOneWinsFirstPoint() {
		createGameScore(1, 0);
		assertEquals("Game score : 15/0", tennisGame.getScore());
	}
	
	@Test
	void testPlayerTwoWinsTwoFirstPoints() {
		createGameScore(0, 2);
		assertEquals("Game score : 0/30", tennisGame.getScore());
	}
	
	@Test
	void testPlayerOneWinsThreeFirstPoints() {
		createGameScore(3, 0);
		assertEquals("Game score : 40/0", tennisGame.getScore());
	}
	
	@Test
	void testPlayersWinTwoPointsEach() {
		createGameScore(2, 2);
		assertEquals("Game score : 30/30", tennisGame.getScore());
	}
	
	@Test
	void testPlayersAreDeuce() {
		createGameScore(4, 4);
		assertEquals("Game score : DEUCE", tennisGame.getScore());
	}
	
	@Test
	void testPlayerOneWinsGame() {
		createGameScore(4, 0);
		assertEquals("Game score : player1 win the game", tennisGame.getScore());
	}
	
	@Test
	void testPlayerTwoWinsGameAfterAdvantage() {
		createGameScore(6, 8);
		assertEquals("Game score : player2 win the game", tennisGame.getScore());
	}
	
	@Test
	void testPlayerOneHasAdvantage() {
		createGameScore(5, 4);
		assertEquals("Game score : ADV player1", tennisGame.getScore());
	}
	
	@Test
	void testPlayerTwoHasAdvantage() {
		createGameScore(6, 7);
		assertEquals("Game score : ADV player2", tennisGame.getScore());
	}
	
	@Test
	void testGameIsTieBreak() {
		createTieBreakScore(0, 0);		
		assertEquals(true, tennisGame.isTieBreak());
	}
	
	@Test
	void testPlayersWonFourPointsEachInTieBreak() {
		createTieBreakScore(4, 4);		
		assertEquals("Tie Break score : 4/4", tennisGame.getScore());	
	}
	
	private void createGameScore(int pointsWonByPlayerOne, int pointsWonByPlayerTwo) {
		player1.setGameScore(pointsWonByPlayerOne);
		player2.setGameScore(pointsWonByPlayerTwo);
	}
	
	private void createTieBreakScore(int pointsWonByPlayerOne, int pointsWonByPlayerTwo) {
		player1.setSetScore(6);
		player2.setSetScore(6);
		
		for (int i = 0; i<pointsWonByPlayerOne; i++)
			player1.winsPoint();
		
		for (int j = 0; j<pointsWonByPlayerTwo; j++)
			player2.winsPoint();
	}
}
