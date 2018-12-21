package reusing;

class Exer19 {
	int i;

	public Exer19(int i) {
		this.i = i;
	}

}

public class Exercise19 {
	final Exer19 e;

	public Exercise19() {
		e = new Exer19(0);
	}

	public Exercise19(int i) {
		this.e = new Exer19(i);
	}

	public static void main(String[] args) {
		Exercise19 exercise19 = new Exercise19();
		Exercise19 exercise1212 = new Exercise19(1212);
		System.out.println(exercise19.e.i++);
		System.out.println(exercise19.e.i);
		System.out.println(exercise1212.e.i++);
		System.out.println(exercise1212.e.i);
		
	}

}
