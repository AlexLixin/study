package reusing;

class A1 {

	public A1(int i) {
		
		System.out.println("A1()"+i);
	}

}

class B1 {
	public B1(int i) {
		System.out.println("B1()"+i);
	}

}

class C1 extends A1 {
	public C1(int i) {
		super(i);
		System.out.println("C1()"+i);
	}

	B1 b1 = new B1(1);
}

public class Exercise7 {
	public static void main(String[] args) {
		new C1(2);
	}

}
