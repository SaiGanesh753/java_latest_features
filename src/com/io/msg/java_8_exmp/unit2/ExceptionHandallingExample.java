package java_8_exmp.unit2;

public class ExceptionHandallingExample {

	public static void main(String[] args) {
		int[] sampleArr = {1, 2, 3, 4, 5};
		//int key = 2;
		int key = 0;
		execute(sampleArr, key);
	}

	private static void execute(int[] sampleArr, int key) {
		for (int i : sampleArr) {
			try {
				System.out.println(i/key);
			} catch (ArithmeticException e) {
				System.out.println("exception happening..");
			}
		}
	}

}
