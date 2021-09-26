package java_8_exmp.unit3;

import java.util.Arrays;
import java.util.List;

import java_8_exmp.unit1.beans.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24), new Person("ram", "babu", 43),
				new Person("veera", "veni", 38), new Person("teja", "swi", 27));

		long count = people.stream().filter(person -> person.getLastName().startsWith("s")).count();
		System.out.println("steam : " + count);
		long count2 = people.parallelStream().filter(person -> person.getLastName().startsWith("s")).count();
		System.out.println("parallel stream : " + count2);
		
		//Note: Both stream and parallel stream works like same, but parallel stream will split collections into group of steams
		// and works parallelly and compare to streams, parallel stream more fast.
	}

}
