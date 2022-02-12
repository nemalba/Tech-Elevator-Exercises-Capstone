package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Program
{

	public static void main(String[] args)
	{
//		cardDemo();
//		deckDemo();
		gameDemo();
	}

	public static void cardDemo()
	{
		System.out.println();
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("             Simple Card Demo");
		System.out.println("*******************************************");
		System.out.println();

		System.out.println("Create 2 cards - display without flipping");
		System.out.println("-----------------------------------------");
		Card card = new Card("Diamonds", "6");
		Card card2 = new Card("Spades", "A");

		System.out.println(card.getFace() + ": " + card.getValue());
		System.out.println(card2.getFace() + ": " + card2.getValue());
		System.out.println();

		System.out.println("Flip the cards and display again");
		System.out.println("--------------");
		card.flip();
		card2.flip();

		System.out.println(card.getFace() + ": " + card.getValue());
		System.out.println(card2.getFace() + ": " + card2.getValue());
		System.out.println();
	}

	public static void deckDemo()
	{
		Deck deck;
		Card card;
		System.out.println();
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("             Simple Deck Demo");
		System.out.println("*******************************************");
		System.out.println();

		System.out.println("Create a deck - and deal the first 5 cards");
		System.out.println("------------------------------------------");
		deck = new Deck();
		for (int i = 0; i < 5; i++)
		{
			card = deck.deal();
			card.flip();
			System.out.println(card.getFace() + ": " + card.getValue());
		}
		System.out.println();


		System.out.println("Create a deck - and shuffle before dealing");
		System.out.println("------------------------------------------");
		deck = new Deck();
		deck.shuffle();
		for (int i = 0; i < 5; i++)
		{
			card = deck.deal();
			card.flip();
			System.out.println(card.getFace() + ": " + card.getValue());
		}
		System.out.println();
	}

	public static void gameDemo()
	{
		System.out.println();
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("             Simple Game Demo");
		System.out.println("*******************************************");
		System.out.println();

		Deck deck = new Deck();
		deck.shuffle();

		List<Hand> players = new ArrayList<>();
		players.add(new Hand("Miranda"));
		players.add(new Hand("Luis"));
		players.add(new Hand("Gary"));
		players.add(new Hand("Terrell"));

		for (int i = 0; i < 5; i++) 
		{
			for(Hand player: players)
			{
				Card card = deck.deal();
				player.deal(card);
			}
		}

		System.out.println();
		System.out.println("Display cards while still playing (cards are not flipped)");
		System.out.println("---------------------------------------------------------");
		for(Hand player: players)
		{
			System.out.println();
			System.out.println(player.getPlayerName());
			player.displayCards();
			System.out.println("Value: " + player.getValue());
		}
		System.out.println();

		System.out.println();
		System.out.println("Display cards after game ends (flip the cards over)");
		System.out.println("---------------------------------------------------");
		for(Hand player: players)
		{
			System.out.println();
			System.out.println(player.getPlayerName());
			player.showHand();
			System.out.println("Value: " + player.getValue());
		}
		System.out.println();


		System.out.println();
		System.out.println("***********************");
		System.out.println("         Winner");
		System.out.println("***********************");
		Hand winner = new Hand("No one");
		for(Hand player: players)
		{
			if(player.getValue() > winner.getValue())
			{
				winner = player;
			}
		}
		System.out.println(winner.getPlayerName());
		winner.showHand();
		System.out.println("Value: " + winner.getValue());

	}

}
