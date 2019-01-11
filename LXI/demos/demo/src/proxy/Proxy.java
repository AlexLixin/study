package proxy;

public class Proxy implements InterfaceA {

	private A a = new A();

	@Override
	public void f() {
		System.out.println("proxy.f()");
		a.f();
	}

	@Override
	public void g() {
		System.out.println("proxy.g()");
		a.g();
	}

}
