/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 27, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise16 {
	public static void main(String[] args) {
		Person16 p = new Person16();
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					p.f();
				}
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					p.g();
				}
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					p.h();
				}
			}
		});
		es.shutdown();
	}
}

class Person16 {
	private Object lock = new Object();
	private Object lock2 = new Object();

	public void f() {
		synchronized (lock) {
			System.out.println("f()");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void g() {
		synchronized (lock) {
			System.out.println("g()");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void h() {
		synchronized (lock2) {
			System.out.println("h()");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}