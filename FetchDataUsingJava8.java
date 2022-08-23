package practice.hacker.rank.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FetchDataUsingJava8 {
	public static void main(String[] args) {
		System.out.println("Global Payments");
		List<Map<String, String>> collData = new ArrayList<>();
		Map<String, String> stuMap = new HashMap<String, String>();
		stuMap.put("Sanjeev", "Course_1");
		stuMap.put("Sanjay", "Course_2");
		stuMap.put("Sandeep", "Course_1");
		stuMap.put("Alex", "Course_2");
		stuMap.put("Dumbo", "Course_1");
		stuMap.put(null, "College_A");
		collData.add(stuMap);

		stuMap = new HashMap<String, String>();
		stuMap.put("Dave", "Course_1");
		stuMap.put("Alex", "Course_2");
		stuMap.put("Dumbo", "Course_1");
		stuMap.put("Rohan", "Course_2");
		stuMap.put("Rohit", "Course_1");
		stuMap.put(null, "College_B");
		collData.add(stuMap);

		// collData.stream().forEach(x->x.entrySet().stream().filter(y->y.getValue().equals("Course_1")).forEach(System.out::println));

		List<String> list = new ArrayList<String>();

		collData.stream().forEach(x -> x.entrySet().stream().filter(y -> y.getValue().equals("Course_1"))
				.forEach(y -> list.add(y.getKey())));
		
		System.out.println(
				"******************************************************************************************************");


		 collData.stream().forEach(x -> x.entrySet().stream().filter(y -> y.getValue().equals("Course_1"))
				.forEach(System.out::println));
		 
		 System.out.println(
					"******************************************************************************************************");


		System.out.println(list);

		System.out.println(
				"******************************************************************************************************");

		collData.stream().forEach(
				x -> x.entrySet().stream().filter(y -> y.getValue().equals("Course_1")).forEach(System.out::println));

		collData.stream().forEach(
				x -> x.entrySet().stream().filter(y -> y.getValue().equals("Course_1")).forEach(System.out::println));

		Map<String, String> values = collData.stream()
				.flatMap(m -> m.entrySet().stream().filter(y -> y.getValue().equals("Course_1")))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1));

		System.out.println(values);

		List<Entry<String, String>> re1 = collData.stream()
				.flatMap(m -> m.entrySet().stream().filter(y -> y.getValue().equals("Course_1")))
				.collect(Collectors.toList());

		System.out.println(re1);

		collData.stream().flatMap(m -> m.entrySet().stream().filter(x -> x.getValue().equals("Course_1")))
				.forEach(System.out::println);

		System.out.println(
				"******************************************************************************************************");

		Map<String, String> resultant = collData.stream()
				.flatMap(m -> m.entrySet().stream().filter(x -> x.getValue().equals("Course_1")))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1));
		resultant.entrySet().stream()
				.forEach(x -> System.out.println("key is :" + x.getKey() + " " + "value is :" + x.getValue()));

		System.out.println(
				"******************************************************************************************************");

		Map<String, String> valueAgain = collData.stream()
				.flatMap(m -> m.entrySet().stream().filter(x -> x.getValue().equals("Course_1")))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

		valueAgain.entrySet().stream().forEach(System.out::println);

	}

}
