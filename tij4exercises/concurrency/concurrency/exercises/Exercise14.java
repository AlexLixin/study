/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 27, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise14 implements Runnable {
	private static int timers = 0;
	private static int tasks = 0;

	public void run() {
		try {
			while (timers < 4000) { // create 4000 Timers
				++timers;
				Timer t = new Timer();
				t.schedule(new TimerTask() {
					public void run() {
						++tasks;
						if (timers % 100 == 0)
							System.out.println(timers + " timers did " + tasks + " tasks");
					}
				}, 0);
				try {
					TimeUnit.MILLISECONDS.sleep(30); // time to do task
				} catch (InterruptedException e) {
					System.out.println("Sleep interrupted");
				}
				t.cancel();
			}
		} finally {
			System.out.println("Done. " + timers + " timers completed " + tasks + " tasks");
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Exercise14());
		exec.shutdown();
	}
}