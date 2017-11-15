package com.katatennis.Abstract;

import com.katatennis.Bean.Player;

public abstract class Score {
	protected Player player1;
	protected Player player2;
	
	public abstract boolean hasWinner();
	
	public abstract Player playerWithHighestScore();
	
	public abstract String getScore();
}
