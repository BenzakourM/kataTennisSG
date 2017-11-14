package com.katatennis.Main;

import com.katatennis.Bean.Player;
import com.katatennis.Class.Match;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("Rafael Nadal");
		Player player2 = new Player("Roger Feder");
		Match tennisGame = new Match(player1, player2);

		//Player2 wins 5 games
		for(int i = 0; i<5; i++) {
			player2.winsPoint();
			System.out.println(tennisGame.getScore());
			player2.winsPoint();
			System.out.println(tennisGame.getScore());
			player2.winsPoint();
			System.out.println(tennisGame.getScore());
			player2.winsPoint();
			System.out.println(tennisGame.getScore());
		}
		
		//Player 2 wins 6 games
		for(int i = 0; i<6; i++) {
			player1.winsPoint();
			System.out.println(tennisGame.getScore());
			player1.winsPoint();
			System.out.println(tennisGame.getScore());
			player1.winsPoint();
			System.out.println(tennisGame.getScore());
			player1.winsPoint();
			System.out.println(tennisGame.getScore());
		}
		
		//player1 wins a game (testing the Deuce and ADV rule)
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		
		// Testing the tie break rule (player1 wins the tie break and the set)
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());		
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player2.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
		player1.winsPoint();
		System.out.println(tennisGame.getScore());
	}
}