package reusing;

class Exer13 {
	public void foo() {
		System.out.println("foo()");
	}

	public void foo(int i) {
		System.out.println("foo(int i)");
	}

	public void foo(String s) {
		System.out.println("foo(String s)");
	}
}

class Exer13Drived extends Exer13 {
	public void foo(boolean b) {
		System.out.println("foo(boolean b)");
	}

}

public class Exercise13 {
	public static void main(String[] args) {
		Exer13Drived exer13Drived = new Exer13Drived();
		exer13Drived.foo();
		exer13Drived.foo(1);
		exer13Drived.foo("fdsa");
		exer13Drived.foo(true);
	}
}
