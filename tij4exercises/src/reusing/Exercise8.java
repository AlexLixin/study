package reusing;

class Base {

	public Base(String s) {
		System.out.println("Base(String s):"+s);
	}
}

class Drivered extends Base {

	public Drivered() {
		super("call super in Drivered()");
		System.out.println("default constructor");
	}

	public Drivered(String s) {
		super("call super in Drivered(String s)" + s);
		System.out.println("non-default constructor" + s);
	}

}

public class Exercise8 {
	public static void main(String[] args) {
		new Drivered();
		new Drivered("with argv");
		
	}
}
