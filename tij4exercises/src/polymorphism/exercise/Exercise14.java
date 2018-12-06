package polymorphism.exercise;

import java.util.Random;

import static net.mindview.util.Print.*;


public class Exercise14 {
	private static Random rand = new Random();
	static Shared s= new Shared();
	public static Rodent next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Mouse(s);
		case 1:
			return new Gerbil(s);
		case 2:
			return new Hamster(s);
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
