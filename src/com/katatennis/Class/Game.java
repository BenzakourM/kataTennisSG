package com.katatennis.Class;

import com.katatennis.Abstract.Score;
import com.katatennis.Bean.Player;

public class Game extends Score {
	
	public Game(Player player1, Player player2) {
		super.player1 = player1;
		super.player2 = player2;
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

	public String tennisScore(int score) {
		switch(score) {
		case 0: return "0";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";
		default: return "0";
		}
	}
	
	public boolean isTieBreak() {
		if(player1.getSetScore() == 6 && player2.getSetScore() == player1.getSetScore())
			return true;
		return false;
	}
	
	public boolean isDeuce() {
		if(player1.getGameScore() > 3 && player1.getGameScore() == player2.getGameScore())
			return true;
		return false;
	}
	
	public boolean hasAdvantage() {
		if(player1.getGameScore() >= 4 && player1.getGameScore() == player2.getGameScore() + 1)
			return true;
		if(player2.getGameScore() >= 4 && player2.getGameScore() == player1.getGameScore() + 1)
			return true;
		return false;
	}
	
	@Override
	public boolean hasWinner() {
		if(isTieBreak()) {
			if(player1.getGameScore() >= 7 && player1.getGameScore() >= player2.getGameScore() + 2 
					|| player2.getGameScore() >= 7 && player2.getGameScore() >= player1.getGameScore() + 2)
				return true;
			return false;
		}
		else {
			if(player1.getGameScore() > 3 && player1.getGameScore() >= player2.getGameScore() + 2) {
				return true;
			}
			if(player2.getGameScore() > 3 && player2.getGameScore() >= player1.getGameScore() + 2) {
				return true;
			}
			return false;
		}
	}
	
	@Override
	public Player playerWithHighestScore() {
		if(player1.getGameScore() > player2.getGameScore()) {
			return player1;
		}
		else
			return player2;
	}

	@Override
	public String getScore() {
		String score;
		if(hasWinner()) {
			score = playerWithHighestScore().winsGame();
			player1.setGameScore(0);
			player2.setGameScore(0);
			return "Game score : " + score;
		}
		if(isTieBreak())
			return "Tie Break score : " + Integer.valueOf(player1.getGameScore()).toString() + "/" + Integer.valueOf(player2.getGameScore()).toString();
		if(isDeuce())
			return "Game score : DEUCE";
		if(hasAdvantage())
			return "Game score : ADV " + playerWithHighestScore().getName();
		return "Game score : " + tennisScore(player1.getGameScore()) + "/" + tennisScore(player2.getGameScore());
	}
}
