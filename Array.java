package Array;

public class Array {

	public static void main(String[] args) {
		String array[][] = new String[2][5];
		array[0][0] = "Namrata";
		array[0][1] = "baviskar";
		array[0][2] = "Vaishnavi";
		array[0][3] = "Bane";
		array[0][4] = "Dhanshree";
		array[1][0] = "Tekale";
		array[1][1] = "Pushkar";
		array[1][2] = "Baviskar";
		array[1][3] = "Shubham";
		array[1][4] = "Singh";
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++)
		{
			System.out.print(i+j+ "=" + array[i][j]+"   ");
		}
		
			System.out.println();
		}
}
}
