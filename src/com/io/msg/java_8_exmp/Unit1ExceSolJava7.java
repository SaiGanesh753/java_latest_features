package java_8_exmp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java_8_exmp.beans.Person;

public class Unit1ExceSolJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24), new Person("ram", "babu", 43),
				new Person("veera", "veni", 38), new Person("teja", "swi", 27));

		// 1. sort list by lastname
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		// 2. create a method to print all elements.
		printPeople(people);

		// 3. Create a method to print elements, which starts lastname with g
		printPersonConditionally(people, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("g");
			}
		});

		// 4. Create a method to print elements, which starts firstname with t

		printPersonConditionally(people, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("t");
			}
		});
	}

	private static void printPersonConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) 
				System.out.println("conditionally : "+person);
		}
	}

	private static void printPeople(List<Person> people) {
		for (Person person : people) {
			System.out.println("person : "+person);
		}
	}
}

interface Condition {
	boolean test(Person person);
}
