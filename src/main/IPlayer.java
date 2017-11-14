package main;

public interface IPlayer {

	public int getSetScore();

	public void setSetScore(int setScore);

	public String getName();

	public void setName(String name);

	public int getGameScore();

	public void setGameScore(int gameScore);
	
	public void winsPoint();
	
	public String winsGame();
	
	public String winsSet();
}
