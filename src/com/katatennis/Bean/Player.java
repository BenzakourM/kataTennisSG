package com.katatennis.Bean;

public class Player {
	private int gameScore;
	private int setScore;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.gameScore = 0;
		this.setScore = 0;
	}
	
	public int getSetScore() {
		return setScore;
	}

	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

	public void winsPoint() {
		gameScore++;
	}
	
	public String winsGame() {
		setScore++;
		return name + " win the game";
	}

	public String winsSet() {
		return name + " win the set and the match";
	}
}
