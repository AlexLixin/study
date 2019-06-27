/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 27, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import net.mindview.util.Generator;

public class Exercise2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new FibonacciThread(i)).start();
        }
    }

}

class FibonacciThread implements Runnable {

    private static int count = 0;
    private int id = count++;

    private int n;

    public FibonacciThread(int n) {
        super();
        this.n = n;
    }

    @Override
    public void run() {
        Generator<Integer> fg = new FibonacciGenerator();
        for (int i = 0; i < n; i++) {
            System.out.println("Thread-" + id + ":" + fg.next());
        }
    }

}

class FibonacciGenerator implements Generator<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        return f(count++);
    }

    private Integer f(int i) {
        if (i < 2) {
            return 1;
        } else {
            return f(i - 1) + f(i - 2);
        }

    }

}