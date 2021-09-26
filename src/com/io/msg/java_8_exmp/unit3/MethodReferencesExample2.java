package java_8_exmp.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java_8_exmp.unit1.beans.Person;

public class MethodReferencesExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24), new Person("ram", "babu", 43),
				new Person("veera", "veni", 38), new Person("teja", "swi", 27));

		//System.out.println(person) === System.out::println  ==> Method references
		printPersonConditionally(people, (Person person) -> person.getFirstName().startsWith("t"), System.out::println); // p -> method(p)
	}

	private static void printPersonConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for (Person person : people) {
			if (condition.test(person))
				consumer.accept(person);
		}
	}
}