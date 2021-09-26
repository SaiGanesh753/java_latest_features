package java_8_exmp.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java_8_exmp.unit1.beans.Person;

public class SimpleFunctionalInterFaceExample {
	
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24), new Person("ram", "babu", 43),
				new Person("veera", "veni", 38), new Person("teja", "swi", 27));

		// 1. sort list by lastName
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// 2. create a method to print all elements.
		System.out.println("printing all..");
		printPersonConditionally(people, p -> true, p -> System.out.println(p));

		// 3. Create a method to print elements, which starts lastName with g
		System.out.println("starts with g");
		printPersonConditionally(people, (Person person) -> person.getLastName().startsWith("g"), p -> System.out.println(p.getLastName()));

		// 4. Create a method to print elements, which starts firstName with t
		System.out.println("starts with t");
		printPersonConditionally(people, (Person person) -> person.getFirstName().startsWith("t"), p -> System.out.println(p.getFirstName()));
	}

	private static void printPersonConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for (Person person : people) {
			if (condition.test(person))
				consumer.accept(person);
		}
	}

}

