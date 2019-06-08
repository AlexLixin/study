package reusing;

class A {

	public A() {
		System.out.println("A()");
	}

}

class B {
	public B() {
		System.out.println("B()");
	}

}

class C extends A {
	B b = new B();
}

public class Exercise5 {
	public static void main(String[] args) {
		new C();
	}
}
