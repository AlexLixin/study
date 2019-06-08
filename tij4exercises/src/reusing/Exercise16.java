package reusing;

class Amphilbian {
	void swim() {
		System.out.println("swim");
	}

	void walk() {
		System.out.println("walk");
	}
}

class Frog extends Amphilbian {

	@Override
	void walk() {  
		System.out.println("frog jump");
	}

}

public class Exercise16 {
	public static void main(String[] args) {
		Amphilbian frog = new Frog();
		
		
		
		
		
		
		 
		frog.swim();
		frog.walk();
	}
}
