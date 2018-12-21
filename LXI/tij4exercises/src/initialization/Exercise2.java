package initialization;

class Tester2 {
	String s1;
	String s2 = "hello";
	String s3;

	Tester2() {
		s3 = "good-bye";
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Tester2 t = new Tester2();
		System.out.println("t.s1: " + t.s1);
		System.out.println("t.s2: " + t.s2);
		System.out.println("t.s3: " + t.s3);
	}
}
