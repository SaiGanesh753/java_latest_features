package java_8_exmp.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ExampleForLoopsChain {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		//External ForLoops
		//1. Normal forloop
		System.out.print("start and end conditional and specific point in loop...");
		for(int i=0; i<values.size(); i++) {
			System.out.print(values.get(i));
		}
		
		//2. Iteration forLoop
		System.out.println();
		System.out.print("while loop values if don't know the end point...");
		Iterator<Integer> iterator = values.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		//3. For each loop... 
		System.out.println();
		for (int i : values) {
			System.out.print(i);
		}
		
		//Internal ForLoops
		//4. ForEach java8 format with inner class.
		System.out.println();
		values.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t);
			}
		});
		
		//5. ForEach with java8 lambda expression.
		System.out.println();
		values.forEach(intVal -> System.out.print(intVal));
		
		//6. java8 lambda expression with method reference.
		System.out.println();
		values.forEach(System.out::print);
		
		//7. Method reference another example
		System.out.println();
		values.forEach(ExampleForLoopsChain::doubleIt);
	}

	public static void doubleIt(int intVal) {
		System.out.print(intVal*2);
	}
	
}
