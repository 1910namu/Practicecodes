package exception;
import java.util.Scanner;

public class user1 {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			System.out.println("1");
			int dev = a/b;
			System.out.println(dev);
			System.out.println("2");
		}catch( Exception e) {
			e.printStackTrace();
			
		}
		
		//catch(ArithemeticException e) {
			//System.out.println(e);
		//}
	
		System.out.println("done");
	}

}
