package java_8_exmp.streams;

import java_8_exmp.streams.interfaces.Actor;

public class Villan implements Actor {

	@Override
	public void act() {
		System.out.println("i can act..");
	}

	@Override
	public void dance() {
		System.out.println("i can manage dance.");
	}

	public static void main(String[] args) {
		Villan villan = new Villan();
		villan.act();
		villan.dance();
		Actor actor = new Villan();
		actor.comedy();
	}
}
