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
		exec.execute(runnables1);
		exec.execute(Runnables2);
	}
}

class Runnables1 implements Runnable {

	@Override
	public void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
		System.out.println("waked up!");
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
		runner.notifyAll();
	}

}
