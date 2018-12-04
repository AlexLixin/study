package polymorphism.exercise;

class Cycle {
	void wheels(int i) {
		System.out.println("wheels number:" + i);
	}

	void ride() {
		wheels(0);
	}
}

class Unicycle extends Cycle {
	void ride() {
		wheels(1);
	}

}

class Bicycle extends Cycle {
	void ride() {
		wheels(2);
	}

}

class Tricycle extends Cycle {
	void ride() {
		wheels(3);
	}

}

public class Exercise1 {
	static void r(Cycle c) {
		c.ride();
	}

	public static void main(String[] args) {
		r(new Cycle());
		r(new Unicycle());
		r(new Bicycle());
		r(new Tricycle());
	}

}
