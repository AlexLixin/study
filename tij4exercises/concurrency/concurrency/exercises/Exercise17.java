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

public class Exercise17 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		RadiationCounter rc = new RadiationCounter();
		for (int i = 0; i < 3; i++) {
			exec.execute(new Sensor(i, rc));
		}
		exec.shutdown();
	}
}

class RadiationCounter {
	private int count;

	public synchronized void increment() {
		count++;
	}

	public synchronized int count() {
		return count;
	}
}

class Sensor implements Runnable {
	private int id;
	private static RadiationCounter radCounter;

	public Sensor(int id, RadiationCounter radCounter) {
		this.id = id;
		Sensor.radCounter = radCounter;
	}

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			radCounter.increment();
			System.out.println(this + "increased. Now count is :" + radCounter.count());
		}
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + "]";
	}

}