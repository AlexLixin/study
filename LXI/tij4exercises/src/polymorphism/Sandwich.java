//: polymorphism/Sandwich.java
// Order of constructor calls.
package polymorphism;

import static net.mindview.util.Print.*;
interface FastFood{
    void isExpired();
}
class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Pickle {

	public Pickle() {
		print("Pickle()");
	}

}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch implements FastFood{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Sandwich() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich().isExpired();
		System.out.println();
	}

    @Override
    public void isExpired() {
        System.out.println("isExpired()");

    }
} /*
	 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce() Sandwich()
	 */// :~
