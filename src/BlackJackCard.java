//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BlackJackCard extends Card{

	//add in an instance variable for value
		int value;
	//create a constructor that receives a suit and a face
		public BlackJackCard(String suit, int face){
			super(suit, face);
			getValue();
		}
	//make a getValue() method that returns the worth of the card
		//based on the rules of BlackJack
		//Ace is worth 11 for now
		//Jack, Queen, and King are all worth 10
		//all other cards are face value
		public int getValue() {
			if(face == 1) {
				value = 11;
			}
			else if(face >=2 && face<=10) {
				value = face;
			}
			else if (face>=11 && face <= 13) {
				value = 10;
			}
			else {
				value = 0;
			}
			return value;
		}
	//make a toString method
		public String toString() {
			 return FACES[face]+" of " + suit + "  "+ value;
		}
}