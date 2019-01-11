package dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void run(InterfaceA ia) {
		ia.f();
		ia.g();
	}

	public static void main(String[] args) {
		InterfaceA ia = (InterfaceA) Proxy.newProxyInstance(InterfaceA.class.getClassLoader(),
				new Class[] { InterfaceA.class }, new DynamicProxy(new A()));
		run(ia);
	}
}
