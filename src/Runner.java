//(c) A+ Computer Science  
//www.apluscompsci.com

//more OOP worksheet 1 key    

import static java.lang.System.*;

class A{
  private int x;

  public A(){
    x=0;
  }
}

class B{
  private int x;

  public B(){
    x=0;
  }
  public String toString(){
    return ""+x;
  }
}


class C{
  private int x;

  public C(){
    x=0;
  }
  public C(int num){
    x=num;
  }
  public String toString(){
    return ""+x;
  }
}


public class Runner
{
	public static void main(String[] args)
	{
			out.println("Question 1");
			//test code in client program
			A test = new A();
			out.println(test);
			out.println(test.toString());
			
			
			
			out.println("\n\nQuestion 2");
			//test code in client program
			B runner = new B();
			out.println(runner);
			out.println(runner.toString());

			
			
			out.println("\n\nQuestion 3");
			//test code in client program
			C tester = new C(56);
			out.println(tester);	
	}
}