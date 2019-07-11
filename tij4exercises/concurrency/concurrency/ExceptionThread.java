/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 11, 2019
 *
 ************************************************************************/
package concurrency;

//: concurrency/ExceptionThread.java
//{ThrowsException}
import java.util.concurrent.*;

public class ExceptionThread implements Runnable {
	public void run() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}
} /// :~