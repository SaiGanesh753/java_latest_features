package java_8_exmp.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandallingExampleSol {

	public static void main(String[] args) {
		int[] sampleArr = { 1, 2, 3, 4, 5 };
		int key = 0;
		execute(sampleArr, key, wrapperLamda((arr, k) -> System.out.println("excute : " + arr / k)));
	}

	private static void execute(int[] sampleArr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : sampleArr) {
			consumer.accept(i, key);
		}
	}

	//We can replace to generic type to handle exceptions in common code. in required places we can call it.
	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer) {
		return (arr, k) -> {
			try {
				consumer.accept(arr, k);
			} catch (ArithmeticException e) {
				System.out.println("exception occured in wrapperLamda");
			}
		};
	}

}
