package reusing;

class Exercise23A {
	static int i = f();

	public Exercise23A() {
		super();
		System.out.println("constructor");
	}

	static int f() {
		System.out.println("class Exercise23A loaded");
		return 13;
	}

	static void g() {
		System.out.println("fdsafdsafdsa");
	}
}

class Exercise23B extends Exercise23A {

}

public class Exercise23 {
	public static void main(String[] args) {
		Exercise23A.g();
		Exercise23A.g();
/*		new Exercise23A();
		new Exercise23A();*/
	}
}
