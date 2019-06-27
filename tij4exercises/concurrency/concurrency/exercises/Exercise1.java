/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 26, 2019
 *
 ************************************************************************/
package concurrency.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new E1()).start();
        }
    }
}

class E1 implements Runnable {

    private static int taskCount = 0;
    private final int id = taskCount++;

    public E1() {
        System.out.println("Thread-" + id + ": " + "E1() created!");
    }

    @Override
    public void run() {
        System.out.println("Thread-" + id + ": " + "message");
        Thread.yield();
        System.out.println("Thread-" + id + ": " + "message");
        Thread.yield();
        System.out.println("Thread-" + id + ": " + "message");
        Thread.yield();
        System.out.println("Thread-" + id + ": " + "E1() end!");
    }
}