package com.itheima.test;

/**
 *
 * 1988
 *
 */
public class A {
    public void print(PrintListener c) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + Integer.toString(i)); //$NON-NLS-1$
            if(i == 5) {
                System.out.println("i:" + Integer.toString(i)+" now call B"); //$NON-NLS-1$ //$NON-NLS-2$
                c.printFive();
            }

        }
    }
}
