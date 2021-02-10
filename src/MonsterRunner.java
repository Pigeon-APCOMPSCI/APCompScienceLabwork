//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("What is Monster 1's name?");
		String name = keyboard.next();
		System.out.println("What is Monster 1's size?");
		int size = keyboard.nextInt();

		//instantiate monster one
		Monster mOne = new Monster(name, size);
		
		//ask for name and size
		System.out.println("What is Monster 2's name?");
		name = keyboard.next();
		System.out.println("What is Monster 2's size?");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Monster mTwo = new Monster(name,size);
		
		System.out.println("\nMonster 1 - "+ mOne.getName() +" " + mOne.getSize());
		System.out.println("Monster 2 - "+ mTwo.getName() +" " + mTwo.getSize());

		if (mOne.isBigger(mTwo)) {
			System.out.println("\nMonster one is bigger than monster two.");

		}else if (mOne.isSmaller(mTwo)) {
			System.out.println("\nMonster one is smaller than monster two.");
		}
		
		if(mOne.namesTheSame(mTwo)) {
			System.out.println("Monster one has the same name as monster two.");

		}else {
			System.out.println("Monster one does not have the same name as monster two.");
		}
	}
}