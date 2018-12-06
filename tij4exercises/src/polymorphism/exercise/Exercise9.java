package polymorphism.exercise;

import java.util.Random;

class Rodent {
	void run() {
		System.out.println("Rodent.run()");
	}

	void eat() {
		System.out.println("Rodent.eat()");
	}
}

class Mouse extends Rodent {
	void run() {
		System.out.println("Mouse.run()");
	}

	void eat() {
		System.out.println("Mouse.eat()");
	}
}

class Gerbil extends Rodent {
	void run() {
		System.out.println("Gerbil.run()");
	}

	void eat() {
		System.out.println("Gerbil.eat()");
	}
}

class Hamster extends Rodent {
	void run() {
		System.out.println("Hamster.run()");
	}

	void eat() {
		System.out.println("Hamster.eat()");
	}
}

public class Exercise9 {
	private static Random rand = new Random();

	public static Rodent next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Mouse();
		case 1:
			return new Gerbil();
		case 2:
			return new Hamster();
		}
	}

	static public void f(Rodent[] r) {
		for (Rodent rodent : r) {
			rodent.eat();
			rodent.run();
		}
	}

	public static void main(String[] args) {
		Rodent[] r = new Rodent[3];
		for (int i = 0; i < r.length; i++) {
			r[i] = next();
		}
		f(r);
	}

}
