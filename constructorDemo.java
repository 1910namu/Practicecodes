package AcessModifier;

public class constructorDemo {
	public constructorDemo()
	{
		System.out.println("Hello Namrata...!!");
	}

	public constructorDemo(String userName) {
		this(21);
		System.out.println(userName);
	}

	public constructorDemo(int age) {
		this();
		System.out.println(age);
	}
	public constructorDemo(String address, int pinCode)
{
		  System.out.println(address+ " "+ pinCode);
	  }

	public static void main(String[] args) {
		constructorDemo ex = new constructorDemo("hey!!");
	}

}
