package com.katatennis.Interface;

import com.katatennis.Bean.Player;

public interface IScore {
	public boolean hasWinner();
	
	public Player playerWithHighestScore();
	
	public String getScore();
}
