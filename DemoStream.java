package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class DemoStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().map(x->x+x).reduce((x,y)->x+y).get();
		System.out.println(sum);
		
	}

}
