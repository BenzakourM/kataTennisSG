package com.katatennis.Class;

import com.katatennis.Abstract.Score;
import com.katatennis.Bean.Player;

public class Set extends Score {
	
	public Set(Player player1, Player player2) {
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

	@Override
	public boolean hasWinner() {
		if ((player1.getSetScore() == 6 && player2.getSetScore() <= 4) || (player2.getSetScore() == 6  && player1.getSetScore() <= 4)
				|| player1.getSetScore() == 7 || player2.getSetScore() == 7)
			return true;
		return false;
	}
	
	@Override
	public Player playerWithHighestScore() {
		if(player1.getSetScore() > player2.getSetScore())
			return player1;
		return player2;
	}
	
	@Override
	public String getScore() {
		String score;
		if(hasWinner()) {
			score = playerWithHighestScore().winsSet();
			player1.setSetScore(0);
			player2.setSetScore(0);
			return "Set score : " + score;
		}
		return "Set score : " + player1.getSetScore() + "/" + player2.getSetScore();
	}
}
