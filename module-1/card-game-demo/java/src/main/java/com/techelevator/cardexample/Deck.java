package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck 
{
    private final List<Card> cards;

    public Deck()
    {
        cards = new ArrayList<>();
        String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit: suits)
        {
            for (String face: faces) {
                cards.add(new Card(suit, face));
            }
        }
    }

    public void showAllCards()
    {
        for (Card card : cards) {
            card.flip();
            System.out.println(card.getFace());
            card.flip();
        }
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public int countCards()
    {
        return cards.size();
    }

    public Card deal()
    {
        Card card = null;

        if(cards.size() > 0)
        {
            card = cards.get(0);
            cards.remove(0);
        }

        return card;
    }
    
}
