//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Rational class
//write all code for your Rational class here
//test your Rational class with the RationalRunner

public class Rational{
	int num;
	int den;
	
	public Rational(int num, int den) {
		this.num = num;
		this.den = den;
	}
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return den;
	}
	public boolean isBigger(Rational rTwo) {
		double num1 = num;
		double den1 = den;
		double num2 = rTwo.getNumerator();
		double den2 = rTwo.getDenominator();
		
		if(num1/den1 > num2/den2) {
			return true;
		}
		return false;
	}
	public void add(Rational rTwo) {
		num = (num * rTwo.getDenominator() + rTwo.getNumerator() * den);
		den = (den * rTwo.getDenominator());
		simplify();
		
	}
	public void simplify() {
		while((num%2 == 0 && den%2 == 0)||(num%3 == 0 && den%3 == 0)||(num%5 == 0 && den%5 ==0)) {
		
			if(num%2 == 0 && den%2 == 0) {
				num /= 2;
				den /= 2;
			}
			else if(num%3 == 0 && den%3 == 0) {
				num /= 3;
				den /= 3;
			}
			else if(num%5 == 0 && den%5 == 0) {
				num /= 5;
				den /= 5;
			}
		}
	}
	public void setRational(int num, int den) {
		this.num = num;
		this.den = den;
	}
	public String toString() {
		return num+"/" + den;
	}
	public boolean equals (Rational rTwo) {
		String rOne = num+"/"+den;
		rTwo.simplify();
		if(rOne.equals(rTwo.toString())) {
			return true;
		}
		return false;
	}
}