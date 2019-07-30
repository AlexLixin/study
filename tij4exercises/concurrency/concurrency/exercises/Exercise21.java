/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 28, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise21 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnables1 runnables1 = new Runnables1();
		Runnables2 Runnables2 = new Runnables2(runnables1);
		exec.execute(Runnables2);
		exec.execute(runnables1);
		exec.shutdown();
	}
}

class Runnables1 implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted!");
			}
			System.out.println("waked up!");
		}
	}

}

class Runnables2 implements Runnable {
	private Runnables1 runner;

	public Runnables2(Runnables1 runner) {
		this.runner = runner;
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			System.out.println("Sleep interrupted!");
		}
		synchronized (runner) {
			runner.notifyAll();
		}

	}

}

//concurrency/Ex21.java
//TIJ4 Chapter Concurrency, Exercise 21, page 1203

/** Create two Runnables, one with a run() that starts and calls wait(). 
* The second class chould capture the reference of the first Runnable
* object. Its run() should call notifyAll() for the first task after some
* number of seconds have passed so that the first task can display a 
* message. Test your classes using an Executor.
**/

/* My solution to one of the exercises in 
* Thinking in Java 4th Edition (by Bruce Eckel).
* It compiles and runs correctly using JDK 1.6.0
* @author Greg Gordon
* @author www.greggordon.org
* July, 2009


import java.util.concurrent.*;
import static org.greggordon.tools.Print.*;

class A implements Runnable {
	private volatile boolean signal = false;
	public synchronized void run() { // method calling wait() must own monitor		
		 try {
			while(!signal) { 	// wait() should always 
						// be used in a loop
				println("A.run() wait()");
				// TimeUnit.MILLISECONDS.sleep(1000);
				wait();
				signal = true;
				println("A is done waiting"); 				
			}			
		} catch(InterruptedException e) {
			println("A run() interrupted");	
		} finally {
			println("Leaving A.run()");	
		}		
	}
	public synchronized void message() {
		println("Hi from A");
	}		
}

class B implements Runnable {	
	private A a;
	public A getA() { return a; }
	B(A a) { this.a = a; } 
	public void run() {
		try { 
			TimeUnit.MILLISECONDS.sleep(2000);
			synchronized(a) { // method calling notifyAll() must own monitor
				println("B.run() a.notifyAll()");
				a.notifyAll();
			}
		} catch(InterruptedException e) {
		 	System.out.println("B sleep interrupted");
		}		
	}	
}

public class Ex21 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		B b = new B(new A());
		exec.execute(b.getA());
		try { 
			TimeUnit.MILLISECONDS.sleep(100);			
		} catch(InterruptedException e) {
		 	System.out.println("main() sleep interrupted");
		}
		b.getA().message();
		exec.execute(b);
		try { 
			TimeUnit.MILLISECONDS.sleep(2500);			
		} catch(InterruptedException e) {
		 	System.out.println("main() sleep interrupted");
		}		
		exec.shutdownNow();
	}
}
*/
