package practice.hacker.rank.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Java8Demos {

	public static void main(String[] args) {
		Map<String, String> mp = new HashMap<>();
		mp.put("Ramesh", "Course3");
		mp.put("Suresh", "Course3");
		mp.put("Sachin", "Course1");
		mp.put("Vijay", "Course4");
		mp.put("Rahul", "Course4");

		mp.forEach((k, v) -> System.out.println("key is:" + k + " " + "value is :" + v));
		mp.entrySet().stream().filter(x -> x.getValue().equals("Course4")).forEach(System.out::println);

		System.out.println(
				"************************************************************************************************");

		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		List<String> result = lines.stream().filter(x -> !x.equals("mkyong")).collect(Collectors.toList());

		System.out.println(result);

		System.out.println(
				"************************************************************************************************");

		mp.entrySet().stream().filter(x -> x.getKey().equals("Rahul")).collect(Collectors.toList())
				.forEach(x -> System.out.println(x.getKey()));

		System.out.println(
				"************************************************************************************************");
		
		lines.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    
	   Map<Integer, String> response1 = map.entrySet().stream().filter(x->x.getKey().equals(2)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
      response1.entrySet().stream().forEach(x->System.out.println(x.getKey()+" ,"+x.getValue())); 
      
      System.out.println(
				"************************************************************************************************");
      
      List<Integer> al = new ArrayList<Integer>();
      
      // Inserting elements to ArrayList class object
      // Custom input integer numbers
      al.add(2);
      al.add(6);
      al.add(9);
      al.add(4);
      al.add(20);
      
      al.stream().filter(x->x%2==0).forEach(System.out::println);
	}

}
