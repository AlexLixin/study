/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 31, 2019
 *
 ************************************************************************/
package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		new Thread(m).start();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(m);
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}