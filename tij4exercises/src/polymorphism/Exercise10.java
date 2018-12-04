package polymorphism;

class Exer10Base {
	void f1() {
		f2();
	}

	void f2() {
		System.out.println("ExerBase f2()");
	}
}

class Exer10Son extends Exer10Base{
	void f2(){
		System.out.println("Exer10Son f2()");
		
	}
}
public class Exercise10 {
	public static void main(String[] args) {
		Exer10Base e = new Exer10Son();
		e.f1();
	}
}
