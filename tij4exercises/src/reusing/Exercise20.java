package reusing;

class Exer20A{
	private void f() {
		System.out.println("Exer20A f()");
	}
	final private void f1() {
		System.out.println("Exer20A f1()");
	}
}
class Exer20B extends Exer20A{
	//@Override
	private void f() {
		System.out.println("Exer20A f()");
	}
	final private void f1() {
		System.out.println("Exer20A f1()");
	}
}

public class Exercise20 {

}
