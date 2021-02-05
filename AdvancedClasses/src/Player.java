//(c) A+ Computer Science
//www.apluscompsci.com

//Player class 

public class Player
{
	private String name;
	private String choice;

	public Player(String nm)
	{
		this.name = nm;
	} 	
	
	public Player(String nm, String ch)
	{
		this.name = nm;
		this.choice = ch;
	} 
		
	public void setName( String nm)
	{
		this.name = nm;
	}	
		
	public void setChoice( String ch )
	{		
		this.choice = ch;
	}	
		
	public String getChoice()
	{
		return choice;
	}	
		
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name + " had " + choice;
	}
}