package java_8_exmp.unit3;

public class MethodReferencesExample {

	public static void main(String[] args) {
		printMethod();
		Thread t = new Thread(() -> System.out.println("hello"));
		t.start();
		
		//Method references
		//() -> System.out.println("hello")  === MethodReferencesExample::printMethod
		Thread t1 = new Thread(MethodReferencesExample::printMethod); // () -> method()
		t1.start();
	}
	
	public static void printMethod() {
		System.out.println("hello");
	}

}
