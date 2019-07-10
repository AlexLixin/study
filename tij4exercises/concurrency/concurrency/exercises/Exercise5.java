/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 11, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import net.mindview.util.Generator;

/*
Exercise 5: (2) Modify Exercise 2 so that the task is a Callable that sums the values of
all the Fibonacci numbers. Create several tasks and display the results.
 */
public class Exercise5 {
	public static void main(String[] args) throws Exception{
		ExecutorService es = Executors.newCachedThreadPool();
		Future<Integer> future = es.submit(new FibonacciThread_callable(12));
		System.out.println(future.get());
	}
}

class FibonacciThread_callable implements Callable<Integer> {

	private static int count = 0;
	private int id = count++;

	private int n;

	public FibonacciThread_callable(int n) {
		super();
		this.n = n;
	}

	@Override
	public Integer call() throws Exception {
		Generator<Integer> fg = new FibonacciGenerator();
		Integer result = new Integer(0);
		for (int i = 0; i < n; i++) {
			result = fg.next();
			System.out.println("Thread-" + id + ":" + result);
		}
		return result;
	}

}