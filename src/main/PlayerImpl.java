package main;

public class PlayerImpl implements IPlayer{
	private int gameScore;
	private int setScore;
	private String name;
	
	public PlayerImpl(String name) {
		this.name = name;
		this.gameScore = 0;
		this.setScore = 0;
	}
	
	@Override
	public int getSetScore() {
		return setScore;
	}

	@Override
	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getGameScore() {
		return gameScore;
	}

	@Override
	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

	@Override
	public void winsPoint() {
		gameScore++;
	}
	
	@Override
	public String winsGame() {
		setScore++;
		return name + " win the game";
	}

	@Override
	public String winsSet() {
		return name + " win the set and the match";
	}
}
