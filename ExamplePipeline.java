package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExamplePipeline {
	
	public static void main(String[] args) {
	
	List<String> names = Arrays.asList("Namrata","Nam","Lewis","Charles","daniel");
	List filteredNames = names.stream().filter(x->x.length()>5).collect(Collectors.toList());
	
   System.out.println("Filtered Names:"+ filteredNames);
   filteredNames.forEach(System.out::println);
   
   List<Integer>nameLengths = names.stream().map(String::length).collect(Collectors.toList());
   
   System.out.println("Name Lengths: "+nameLengths);
   
   nameLengths.forEach(System.out::println);
   
   long count = names.stream().count();
   System.out.println("Number of Names: "+count);
}
}
