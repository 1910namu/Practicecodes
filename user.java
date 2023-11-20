package exception;

import java.util.Scanner;

public class user {
	static final String user = "xyz";

	public static void main(String[] args) throws user_not_found {
		System.out.println("Enter user name");
        Scanner sc = new Scanner(System.in);
        
        String userName = sc.next();
        
        if(user.equals(userName)){
        	System.out.println("login done");
        }else {
        	throw new user_not_found("you are not able to login");
        }
	}
	
}
