package reusing;

public class Exercise2 extends Detergent {

	@Override
	public void scrub() {
		append(" Exercise2.scrub()");
		super.scrub();
	}

	public void sterilize() {
		append(" sterilize()");
	}
	public static void main(String[] args) {
		Exercise2 e = new Exercise2();
		e.dilute();
		e.foam();
		e.apply();
		e.scrub();
		e.sterilize();
		System.out.println(e);
	}
}
