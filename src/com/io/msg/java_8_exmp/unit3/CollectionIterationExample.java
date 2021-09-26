package java_8_exmp.unit3;

import java.util.Arrays;
import java.util.List;

import java_8_exmp.unit1.beans.Person;

public class CollectionIterationExample {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24), new Person("ram", "babu", 43),
				new Person("veera", "veni", 38), new Person("teja", "swi", 27));
		
		//external for loop
		System.out.println("for loop");
		for (int i=0; i< people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		//external for each
		System.out.println("external for each");
		for (Person person : people) {
			System.out.println(person);
		}
		
		//foreach
		System.out.println("for each");
		people.forEach(System.out::println);
		
		//Note: external means you have to write and handle the loops.
	}
}
