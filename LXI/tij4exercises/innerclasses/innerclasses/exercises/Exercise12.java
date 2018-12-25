package innerclasses.exercises;

import innerclasses.exercises.Exer71.Exer72;

class Exer12_1 {

	private String s;

	public Exer12_1(String s) {
		this.s = s;
	}

	private void f() {
		System.out.println("f()"); //$NON-NLS-1$
	}
	
	abstract class Exer72{
		abstract void run();
	}

	void g() {
		System.out.println("g()"); //$NON-NLS-1$
		new Exer72() {
			void run() {
				System.out.println("Exer72.run()"); //$NON-NLS-1$
				s = "fdsafdsa"; //$NON-NLS-1$
				f();
			}
		}.run();
	}

	void show() {
		System.out.println(s);
	}

}

public class Exercise12 {
	public static void main(String[] args) {
		Exer71 e = new Exer71("xixix"); //$NON-NLS-1$
		e.show();
		e.g();
		e.show();
	}
}
