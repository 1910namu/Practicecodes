package Operator;

public class Relational {
	
	public void equalsTo(int a,int b) {
		
		System.out.println("Value of a==b is "+ (a==b));
	}
	
	public void notEqualsto(int a,int b)
	{
		
		System.out.println("Value of a!=b is "+ (a!=b));
		
	}

	public void greaterthan(int a,int b)
	{
		
		System.out.println("Value of a<b "+ (a<b));
	}

	public void lessthan(int a,int b)
	{
		
		System.out.println("Value of a>b "+ (a>b));
	}

	public void greaterthanequalsto(int a, int b)
	{
		
		System.out.println("Value of a<=b is "+(a<=b));
		
	}

	public void lessthanequalsto(int a,int b)
	{
		
		System.out.println("Value of a>=b is "+(a>=b));
	}

	public static void main(String[] args)
	{
		
		Relational i = new Relational();
		i.equalsTo(10,2);
		i.notEqualsto(22,4);
		i.greaterthan(1,2);
		i.lessthan(2,6);
		i.greaterthanequalsto(6,4);
		i.lessthanequalsto(4,5);
		
	}

}
