/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 27, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise3 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newCachedThreadPool();

        System.out.println("------------------newCachedThreadPool--------------------------");
        for (int i = 0; i < 10; i++) {
            e.execute(new E1());
        }
        e.shutdown();
        System.out.println("------------------newFixedThreadPool--------------------------");
        e = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            e.execute(new E1());
        }
        e.shutdown();
        System.out.println("------------------newSingleThreadExecutor--------------------------");
        e = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            e.execute(new E1());
        }
        e.shutdown();
    }
}
