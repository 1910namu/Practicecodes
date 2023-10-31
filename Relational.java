package Operator;

public class Relational {
	
	public void equalsto() {
		int a = 10;
		int b = 20;
		System.out.println("Value of a==b is "+ (a==b));
	}
	
	public void notequalsto()
	{
		int a = 10;
		int b = 20;
		System.out.println("Value of a!=b is "+ (a!=b));
		
	}

	public void greaterthan()
	{
		int a = 10;
		int b = 20;
		System.out.println("Value of a<b "+ (a<b));
	}

	public void lessthan()
	{
		int a = 10;
		int b = 20;
		System.out.println("Value of a>b "+ (a>b));
	}

	public void greaterthanequalsto()
	{
		int a = 10;
		int b = 20;
		System.out.println("Value of a<=b is "+(a<=b));
		
	}

	public void lessthanequalsto()
	{
		int a = 10;
		int b = 20;
		System.out.println("Value of a>=b is "+(a>=b));
	}

	public static void main(String[] args)
	{
		
		Relational i = new Relational();
		i.equalsto();
		i.notequalsto();
		i.greaterthan();
		i.lessthan();
		i.greaterthanequalsto();
		i.lessthanequalsto();
		
	}

}
