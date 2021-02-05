//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		//call random set Choice
		randomSetChoice();
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		//use Math.random()
		int ran = (int) (Math.random()*3);
		//use switch case
		switch(ran){
		
		case 0: 
			choice = "rock"; 
			break;		
		case 1: 
			choice = "paper"; 
			break;

		case 2: 
			choice = "scissors"; 
			break;
		
				
		}
	
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
		if(p.getChoice().equals(choice)) {
			return 0;
		}else if(p.getChoice().equals("scissors")) {
			if(choice.equals("rock")) {
				return 1;
			}else {
				return -1;
			}
		}else if(p.getChoice().equals("rock")) {
			if(choice.equals("paper")) {
				return 1;
			}else {
				return -1;
			}
		}else if(p.getChoice().equals("paper")) {
			if(choice.equals("scissors")) {
				return 1;
			}else {
				return -1;
			}
		}else {
			return 0;
		}
	
	}
	
	public String toString()
	{
		return "Pooter had " + getChoice();
	}		   
}