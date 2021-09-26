package java_8_exmp.unit2;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//java 7
		/*process(a, new processInterface() {
			@Override
			public void process(int i) {
				System.out.println(a+b);
			}
		});*/
		
		//java 8
		//Here b value is placed compiler treated like final variable and the value is passing Closures methods.
		process(a, i -> System.out.println(i+b));
		// if trying to override the variable compiler will intimate with an error.
		//b=30;
	}
	public static void process(int i, processInterface process) {
		process.process(i);
	}
}

interface processInterface {
	void process(int i);
}
