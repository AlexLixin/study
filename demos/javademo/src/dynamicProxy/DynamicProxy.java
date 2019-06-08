package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private A a;

	public DynamicProxy(A a) {
		this.a = a;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke()");
		return method.invoke(a, args);
	}

}
