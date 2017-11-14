package main;

public class Main {

	public static void main(String[] args) {
		IPlayer player1 = new PlayerImpl("Rafael Nadal");
		IPlayer player2 = new PlayerImpl("Roger Feder");
		Match game = new Match(player1, player2);
		
		//Player2 wins 5 games
		for(int i = 0; i<5; i++) {
			player2.winsPoint();
			System.out.println(game.getScore());
			player2.winsPoint();
			System.out.println(game.getScore());
			player2.winsPoint();
			System.out.println(game.getScore());
			player2.winsPoint();
			System.out.println(game.getScore());
		}
		
		//Player 2 wins 6 games
		for(int i = 0; i<6; i++) {
			player1.winsPoint();
			System.out.println(game.getScore());
			player1.winsPoint();
			System.out.println(game.getScore());
			player1.winsPoint();
			System.out.println(game.getScore());
			player1.winsPoint();
			System.out.println(game.getScore());
		}
		
		//player1 wins a game (testing the Deuce and ADV rule)
		player1.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		
		// Testing the tie break rule (player1 wins the tie break and the set)
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());		
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player2.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
		player1.winsPoint();
		System.out.println(game.getScore());
	}
}