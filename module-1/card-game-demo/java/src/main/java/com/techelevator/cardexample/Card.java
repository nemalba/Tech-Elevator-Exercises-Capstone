package com.techelevator.cardexample;

import java.util.HashMap;
import java.util.Map;

public class Card
{
	// static maps are shared between all card instances
	// the static constructor is at the bottom of the class
	public static final Map<String, Integer> valueMap = new HashMap<>();
	private static final Map<String, Character> symbols = new HashMap<>();
	private static final Map<String, String> colors = new HashMap<>();

	// what does it know?
	// should ALWAYS be private
	private final String suit;
	private final String face;
	private boolean isFaceUp;
	
	// getters return the values
	// that are stored in private variables
	public String getSuit()
	{
		return this.suit;
	}

	public String getFace()
	{
		if(isFaceUp)
		{
			return String.format("%s%s %s of %s%s", getColor(), getSymbol(), this.face, suit, colors.get("Reset"));
		}
		else
		{
			return "##";
		}
	}
	
	public boolean isFaceUp()
	{
		return isFaceUp;
	}

	// derived property
	// does NOT have a backing variable
	// the return is calculated based on 
	// other variables
	public int getValue()
	{
		if(!this.isFaceUp)
		{
			return 0;
		}

		return valueMap.get(this.face);
	}	

	public char getSymbol()
	{
		return symbols.get(suit);
	}
	
	public String getColorName()
	{
		if(suit.equals("Spades") || suit.equals("Clubs"))
		{
			return "Black";
		}
		else 
		{
			return "Red";
		}
	}

	public String getColor()
	{
		String color = getColorName();
		if(color.equals("Black")) color = "Reset";

		return colors.get(color);
	}

	public void flip()
	{
		isFaceUp = !isFaceUp;
	}
	
	// constructors give us control
	// over HOW to create the object
	// - this is called on -> new Card()
	public Card(String suit, String face)
	{
		this.suit = suit;
		this.face = face;
		isFaceUp = false; // booleans are false by default - but I want to be explicit
	}


	// static constructor - is used to populate all static maps
	// is defined simply by the word static
	static
	{
		valueMap.put("2",2);
		valueMap.put("3",3);
		valueMap.put("4",4);
		valueMap.put("5",5);
		valueMap.put("6",6);
		valueMap.put("7",7);
		valueMap.put("8",8);
		valueMap.put("9",9);
		valueMap.put("10",10);
		valueMap.put("J",10);
		valueMap.put("Q",10);
		valueMap.put("K",10);
		valueMap.put("A",11);

		symbols.put("Spades", '\u2660');
		symbols.put("Diamonds", '\u2666');
		symbols.put("Clubs", '\u2663');
		symbols.put("Hearts", '\u2665');

		colors.put("Reset", "\u001B[0m");
		colors.put("Black", "\u001B[30m");
		colors.put("Red", "\u001B[31m");
		colors.put("Green", "\u001B[32m");
		colors.put("Yellow", "\u001B[33m");
		colors.put("Blue", "\u001B[34m");
		colors.put("Purple", "\u001B[35m");
		colors.put("Cyan", "\u001B[36m");
		colors.put("White", "\u001B[37m");
	}
	

}
