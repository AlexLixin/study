package proxy;

public class Test {
	public static void run(InterfaceA ia) {
		ia.f();
		ia.g();
	}

	public static void main(String[] args) {
		InterfaceA ia = new Proxy();
		run(ia);
	}
}
