package classobject;

public class staticblock {
	
	public staticblock() {
		System.out.println("Hello");
	}

	{
		int a=10;
		int b= 20;
		System.out.println(a+b);
	
	
	}
	
	static {
		
		int a=10;
		int b= 20;
		System.out.println(a*b);
	}


	public static void main(String[] args) {
		
		System.out.println("Main method......");
		staticblock c = new staticblock();
		

	}

}
