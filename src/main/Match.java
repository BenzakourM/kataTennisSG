package main;

public class Match implements IScore {
	private IPlayer player1;
	private IPlayer player2;
	private Game game;
	private Set set;
	
	public Match(IPlayer player1, IPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
		game = new Game(player1, player2);
		set = new Set(player1, player2);
	}
	
	public IPlayer getPlayer1() {
		return player1;
	}

	public void setPlayer1(IPlayer player1) {
		this.player1 = player1;
	}

	public IPlayer getPlayer2() {
		return player2;
	}

	public void setPlayer2(IPlayer player2) {
		this.player2 = player2;
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
	public String getScore() {
		return game.getScore() + "\n" + set.getScore();
	}

}
