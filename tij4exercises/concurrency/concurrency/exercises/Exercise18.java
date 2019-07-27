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
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Exercise18 {
	public static void main(String[] args) throws Exception {
		Task18 t = new Task18(new NonTask());
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<?> f = exec.submit(t);
		exec.shutdown();
		TimeUnit.SECONDS.sleep(1);
		f.cancel(true);
	}
}

class NonTask {
	public void f() {
		try {
			TimeUnit.SECONDS.sleep(3);
			System.out.println("nonTask.f()");
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
	}
}

class Task18 implements Runnable {

	private NonTask nonTask;

	public Task18(NonTask nonTask) {
		this.nonTask = nonTask;
	}

	@Override
	public void run() {
		nonTask.f();
	}

}