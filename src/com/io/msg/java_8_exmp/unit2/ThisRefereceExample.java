package java_8_exmp.unit2;

public class ThisRefereceExample {

	public void doProcess(int i, processInterface process) {
		process.process(i);
	}

	public void execute() {
		System.out.println(this); // here calling ThisRefereceExample ref
		doProcess(10, i -> {
			System.out.println("i value : " + i);
			System.out.println(this); // This executes as like out side, and here calling ThisRefereceExample ref
		});
	}

	public static void main(String[] args) {
		ThisRefereceExample thisRefereceExample = new ThisRefereceExample();
		thisRefereceExample.doProcess(10, new processInterface() {
			@Override
			public void process(int i) {
				System.out.println("i value : " + i);
				System.out.println(this); // This reference thisRef object.
			}
		});

		// System.out.println(this); // not work in static consent
		thisRefereceExample.doProcess(10, i -> {
			System.out.println("i value : " + i);
			// System.out.println(this); //This not overide and work.
		});

		thisRefereceExample.execute();
	}

}
