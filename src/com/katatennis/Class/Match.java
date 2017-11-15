package com.katatennis.Class;

import com.katatennis.Abstract.Score;
import com.katatennis.Bean.Player;

public class Match extends Score {
	private Game game;
	private Set set;
	
	public Match(Player player1, Player player2) {
		super.player1 = player1;
		super.player2 = player2;
		game = new Game(player1, player2);
		set = new Set(player1, player2);
	}
	
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		super.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		super.player2 = player2;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	@Override
	public boolean hasWinner() {
		if(set.hasWinner())
			return true;
		return false;
	}

	@Override
	public Player playerWithHighestScore() {
		if(player1.getSetScore() == player2.getSetScore())
			return game.playerWithHighestScore();
		return set.playerWithHighestScore();
	}
	
	@Override
	public String getScore() {
		return game.getScore() + "\n" + set.getScore();
	}

}
