package reusing;

class Exer18Static{
	static final int i = 43;
	final int f;
	public Exer18Static() {
		f = 1;
	}
	public Exer18Static(int f) {
		this.f = f;
	}
	
	
	
}
public class Exercise18 {
public static void main(String[] args) {
	System.out.println(Exer18Static.i);
	System.out.println(new Exer18Static().f);
	System.out.println(new Exer18Static(565656).f);
}
}
