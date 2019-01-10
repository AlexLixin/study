package com.itheima.test;

public class A {
    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + Integer.toString(i)); //$NON-NLS-1$
            if(i == 5) {
                System.out.println("i:" + Integer.toString(i)+" now call B");
                B b = new B();
            }

        }
    }
}
