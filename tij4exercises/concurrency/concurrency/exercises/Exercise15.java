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

public class Exercise15 {
	public static void main(String[] args) {
		Person15 p = new Person15();
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

class Person15 {
	private Object lock = new Object();

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
		synchronized (lock) {
			System.out.println("h()");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}