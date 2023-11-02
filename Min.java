package Operator;
import java.util.Scanner;
public class Min {
	public static void main(String[] args) 
	{
		int [ ] a = new int [5];
		int min;
		
		System.out.println("Enter Element of in Array: ");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		 min = a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min = a[i];
			 }
		 }
		 
		 String minAsString = Integer.toString(min);
		 System.out.println("Minimum number from array is : "+minAsString);
	}

}
