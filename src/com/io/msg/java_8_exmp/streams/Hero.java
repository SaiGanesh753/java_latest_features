package java_8_exmp.streams;

import java_8_exmp.streams.interfaces.Actor;

public class Hero implements Actor {

	@Override
	public void act() {
		System.out.println("i can act...");
	}

	@Override
	public void dance() {
		System.out.println("i can dance..");
	}

	//Override concept
	@Override
	public void comedy() {
		System.out.println("i can make fun...");
	}
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.act();
		hero.dance();
		hero.comedy();
	}

}
