package Controlflow;

public class NestedIf {

	public static void main(String[] args) {
		
		int[ ] arr= {0,1,2,3,4,5,6,7,8,9,10,11};
		int even = 0;
		int odd = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		int[] evenArr = new int[even];
		int[] oddArr = new int[odd];
		int k=0, j=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenArr[k++] = arr[i];
			}else {
				oddArr[j++] = arr[i];
			}
		}
		
		for(int i=0; i<evenArr.length; i++) {
			System.out.print(" "+ evenArr[i]);
		}
		   System.out.println();
		  for(int i=0; i < oddArr.length;i++) {
			  System.out.print(" "+ oddArr[i]);
		  }
	}
	}
