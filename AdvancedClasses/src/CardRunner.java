//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		//  uncomment once Card is built
		//LAB 1 - Just Card 
		Card one = new Card("SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("CLUBS", 4);
		out.println(three);

		Card four = new Card("SPADES", 12);
		out.println(four);

		Card five = new Card("HEARTS", 12);
		out.println(five);
		
		out.println("\n\n\n\nNEXT LAB---------------------\n\n\n\n\n");
		
		//LAB 2 Blackjack Card
		Card one2 = new Card("SPADES", 9);
		out.println(one2.getSuit());
		out.println(one2.getFace());

		Card two2 = new Card("DIAMONDS", 1);
		out.println(two2);
		two2.setFace(3);
		out.println(two2);

		Card three2 = new Card("CLUBS", 4);
		out.println(three2);

		Card four2 = new BlackJackCard("SPADES", 1);
		out.println(four2);

		Card five2 = new BlackJackCard("HEARTS", 13);
		out.println(five2);
		
		Card six2 = new BlackJackCard("HEARTS", 11);
		out.println(six2);
		
		Card seven2 = new BlackJackCard("CLUBS", 12);
		out.println(seven2);	
	}
}