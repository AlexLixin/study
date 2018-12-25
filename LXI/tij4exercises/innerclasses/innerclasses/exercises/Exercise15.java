package innerclasses.exercises;

class Exer15_1 {
	private String s;

	public Exer15_1(String s) {
		this.s = s;
	}

}

class Exer15_2 {
	Exer15_1 f() {
		return new Exer15_1("fdsafdsaf") {
			public void g() {
				System.out.println("g()");
			}
		};

	}
}

public class Exercise15 {

	public static void main(String[] args) {
		Exer15_2 exer15_2 = new Exer15_2();
		Exer15_1 f = exer15_2.f();
	}
}
