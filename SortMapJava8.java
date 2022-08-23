package practice.hacker.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import practice.hacker.rank.model.Employee;

public class SortMapJava8 {

	public static void main(String[] args) {
		Map<String, Integer> result = new HashMap<>();
		result.put("Ramesh", 8);
		result.put("Ganesh", 3);
		result.put("Suresh", 11);
		result.put("Roht", 2);
		result.put("Sachin", 10);
		result.put("Virat", 1);

		result.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(System.out::println);
		
		System.out.println("********************************************");

		Map<String, Integer> local = result.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		local.entrySet().stream().forEach(System.out::println);

		System.out.println("********************************************");
		List<Integer> list1 = Arrays.asList(4, 7, 1, 3, 7, 10, 9);
		Map<String, Integer> valueMap = result.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

		valueMap.entrySet().stream()
				.forEach(x -> System.out.println("key is :" + x.getKey() + " " + "value is :" + x.getValue()));

		System.out.println(
				"*******************************************************************************************************************************************************");
		List<Integer> sortList = list1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

		sortList.stream().forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");
		List<String> sortString = Arrays.asList("Sonal", "Parineeti", "Deepu", "Naval", "Ramesh");

		sortString.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");
		list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");

		result.entrySet().stream().sorted((o1, o2) -> o1.getValue() - o2.getValue()).forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");

		result.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");

		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(103, "Ramesh", 750000), 7);
		employeeMap.put(new Employee(101, "Ganesh", 1750000), 5);
		employeeMap.put(new Employee(107, "Suresh", 850000), 10);
		employeeMap.put(new Employee(102, "Rohit", 950000), 15);
		employeeMap.put(new Employee(110, "Rahul", 100000), 1);

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
				.forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");
		Map<Employee, Integer> customMap = employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(customMap);

		System.out.println(
				"*******************************************************************************************************************************************************");

		Map<Employee, Integer> reverseMap = employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		reverseMap.entrySet().stream().forEach(System.out::println);

		System.out.println(
				"*******************************************************************************************************************************************************");

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(103, "Ramesh", 750000));
		employeeList.add(new Employee(101, "Ganesh", 1750000));
		employeeList.add(new Employee(107, "Suresh", 850000));
		employeeList.add(new Employee(102, "Rohit", 950000));

		Map<String, Integer> resultantMap = employeeList.stream().filter(x -> x.getSalary() > 750000)
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary, (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println(resultantMap);

		System.out.println(
				"*******************************************************************************************************************************************************");

		Map<String, Integer> sortedNameMap = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary, (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println(sortedNameMap);

		System.out.println(
				"*******************************************************************************************************************************************************");

		Map<Integer, Integer> sortedSalaryMap = employeeList.stream().filter(x -> x.getSalary() > 750000)
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors
						.toMap(Employee::getEmployeeId, Employee::getSalary, (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println(sortedSalaryMap);

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

	}

}
