package demo.jdk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import demo.jdk.entity.Person;



public class StreamMain {
	
	public static final List<Person> personList = 
			Arrays.asList(new Person[]{
					new Person(1, "测试1", 10, "test"),
					new Person(2, "测试2", 20, "test"),
					new Person(3, "测试3", 30, "test"),
					new Person(4, "测试4", 40, "dev"),
					new Person(5, "测试5", 50, "dev"),
					new Person(6, "测试1", 10, "test"),
					new Person(7, "测试1", 10, "test")
			});
	
	public static int avgAge(List<Person> personList){
		int avg = 0;
		double avgDouble = personList.parallelStream().mapToInt(Person::getScore).average().getAsDouble();
		avg = Double.valueOf(avgDouble).intValue();
		
		return avg;
	}
	
	public static int sumAge(List<Person> personList){
		int sum = 0;
		sum = personList.parallelStream().mapToInt(Person::getScore).sum();
		
		return sum;
	}
	
	public static void sumByRealName(List<Person> personList){
		Map<String, Integer> realNameMap = personList.stream().collect(Collectors.groupingBy(Person::getRealName, Collectors.reducing(0, Person::getScore, Integer::sum)));
		
		
		
		System.out.println("\n\n " + realNameMap);
	}

	public static void main(String[] args) {
		List<Person> personTestList = personList;
		int avgAge = avgAge(personTestList);
		System.out.println("\n\n avgAge=" + avgAge);
		
		int sumAge = sumAge(personTestList);
		System.out.println("\n\n sumAge=" + sumAge);
		
		
		sumByRealName(personTestList);
		

	}

}
