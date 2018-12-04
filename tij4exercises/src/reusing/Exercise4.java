/*package reusing;

import static net.mindview.util.Print.print;

class A{

	public A() {
		System.out.println("A()");
	}
	
}
class B extends A{
	
	public B() {
		System.out.println("B()");
	}
	
}
class C extends B{
	
	public C() {
		System.out.println("C()");
	}
	
}
class D extends C{
	
	public D() {
		System.out.println("D()");
	}
	static D makeD() {
		return new D();
	}
	public static void main(String[] args) {
		D d = new D();
		D d2 = makeD();
	}
	
}

public class Exercise4 {
	public static void main(String[] args) {
		D.main(null);
	}

}
*/