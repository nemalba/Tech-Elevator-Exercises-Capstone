package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Hand 
{
    private final List<Card> cards;
    private final String playerName;

    public String getPlayerName()
    {
        return playerName;
    }

    public Hand(String playerName)
    {
        cards = new ArrayList<>();
        this.playerName = playerName;
    }

    public void deal(Card card)
    {
        // no return statement - because the method returns void
        cards.add(card);
    }
    
    public int countCards()
    {
    	// I must return an int
        return cards.size();
    }

    public void displayCards()
    {
        for (Card card : cards)
        {
            System.out.println(card.getFace());
        }
    }

    public void showHand()
    {
        for (Card card : cards) 
        {
            if(!card.isFaceUp())
            {
                card.flip();
            }
        }
        displayCards();
    }
    
    public int getValue()
    {
    	int value = 0;
    	
    	for (Card card : cards)
		{
            value += card.getValue();
		}
    	
    	return value;
    }
}
