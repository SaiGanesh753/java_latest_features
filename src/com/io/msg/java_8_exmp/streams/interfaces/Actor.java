package java_8_exmp.streams.interfaces;

/*
 * This example interface for explaining java 8 interface future.
 * before java 8 if we declare new method inside existing interface, we should has to implement in all implemented classes.
 * From java 8 we can define new method inside interface, in implemented classes we can override it.
 */
public interface Actor {
	
	void act();
	void dance();
	default void comedy() {
		System.out.println("inside interface comedy...");
	}
}
