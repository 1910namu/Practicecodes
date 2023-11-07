package Controlflow;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=1; i<=num; i++) {
			
			for(int j = 4; j>i ; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print(" "+ k);
			}
			System.out.println( );
		}
		
		for(int i =1; i<=num1;i++) {
			for(int j=3; j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(" " +k);
			}
			System.out.println();
		}
		for(int i = 1; i<=num2;i++) {
			for(int j= 5; j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k++) {
				System.out.print(" "+k);
			}
			System.out.println();
		}

	}

}
