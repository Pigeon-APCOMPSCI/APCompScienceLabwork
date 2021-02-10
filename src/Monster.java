//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Monster class
//write all code for your Monster class here
//test your Monster class with the MonsterRunner
public class Monster{
	int size;
	String name;
	
	public Monster(String name, int size){
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isBigger(Monster m) {
		if (size > m.getSize()) {
			return true;
		}
		return false;
	}
	public boolean isSmaller(Monster m) {
		if (size < m.getSize()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster m) {
		if (name.equals(m.getName())) {
			return true;
		}
		return false;
	}
}