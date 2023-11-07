package Controlflow;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
	
		
		{  
		   int num = 0;
		   int reversed = 0;
			System.out.println("Enter the number that you want to reverse: ");  
			Scanner sc = new Scanner(System.in);  
			num = sc.nextInt();  
			
			 while (num != 0) {
		           int digit = num % 10;
		           reversed = reversed * 10 + digit;
		           num /= 10;
		       }

		       System.out.println("Reversed Number: " + reversed);
			
			}  
		}
	}



