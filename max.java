package Operator;
import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		int [ ] a = new int [5];
		int max;
		
		System.out.println("Enter Element of in Array: ");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		 max = a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max = a[i];
			 }
		 }
		 
		 String maxAsString = Integer.toString(max);
		 System.out.println("Maximum number from array is : "+maxAsString);

	}

}
