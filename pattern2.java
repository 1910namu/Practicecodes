package Controlflow;

public class pattern2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(i%2==0) {
					System.out.print("o");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println( );
		}
		
	}

}
