package reusing;

class Component1 {

	public Component1(String s) {
		System.out.println("Component1(" + s + ")");
	}
	public void dispose() {
		System.out.println("Component1 dispose()");
	}

}

class Component2 {
	public Component2(String s) {
		System.out.println("Component2(" + s + ")");
	}
	public void dispose() {
		System.out.println("Component2 dispose()");
	}
}

class Component3 {
	public Component3(String s) {
		System.out.println("Component3(" + s + ")");
	}
	public void dispose() {
		System.out.println("Component3 dispose()");
	}
}

class Root {
	private Component1 component1 = new Component1("in Root");
	private Component2 component2 = new Component2("in Root");
	private Component3 component3 = new Component3("in Root");

	public Root(String s) {
		System.out.println("Root(" + s + ")");
	}
	public void dispose() {
		component3.dispose();
		component2.dispose();
		component1.dispose();
		System.out.println("Root dispose()");
	}
}

class Stem extends Root {
	private Component1 component1 = new Component1("in Stem");
	private Component2 component2 = new Component2("in Stem");
	private Component3 component3 = new Component3("in Stem");

	public Stem(String s) {
		super(s);
		System.out.println("Stem(" + s + ")");
	}
	public void dispose() {
		component3.dispose();
		component2.dispose();
		component1.dispose();
		System.out.println("Stem dispose()");
		super.dispose();
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		new Stem("main").dispose();;
		
	}
}
