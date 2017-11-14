package main;

public class Set implements IScore {
	private IPlayer player1;
	private IPlayer player2;
	
	public Set(IPlayer player1, IPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
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

	public boolean hasWinner() {
		if ((player1.getSetScore() == 6 && player2.getSetScore() <= 4) || (player2.getSetScore() == 6  && player1.getSetScore() <= 4)
				|| player1.getSetScore() == 7 || player2.getSetScore() == 7)
			return true;
		return false;
	}
	
	public IPlayer playerWithHighestScore() {
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
