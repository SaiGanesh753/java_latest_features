package java_8_exmp;

import java.util.Arrays;
import java.util.List;

import java_8_exmp.beans.Person;

public class Unit1Exce {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("sai", "ganesh", 24),
				new Person("ram", "babu", 43),
				new Person("veera", "veni", 38),
				new Person("teja", "swi", 27));
		
		//1. sort list by lastname
		//2. create a method to print all elements.
		//3. Create a method to print elements, which starts lastname with g
		//4. Create a method to print elements, which starts firstname with t
	}
}
