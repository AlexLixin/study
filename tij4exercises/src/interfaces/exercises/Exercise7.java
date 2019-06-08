/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Dec 11, 2018
 *
 ************************************************************************/
package interfaces.exercises;

import java.util.Random;

import static net.mindview.util.Print.*;

class Description1 {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private String s;

    Description1(String s, Shared shared) {
        this.s = s;
        this.shared = shared;
        this.shared.addRef();
        print("Creating " + this); //$NON-NLS-1$
    }

    protected void dispose() {
        print("disposing " + this); //$NON-NLS-1$
        shared.dispose();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + s + " " + id; //$NON-NLS-1$
    }

}

interface Rodent1 {
    void run();

    void eat();

    public String toString();
}

class Mouse1 implements Rodent1 {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description d; //$NON-NLS-1$

    public Mouse1(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description("Mouse description", this.shared);
        this.shared.addRef();
    }

    public Mouse1() {
        print("Mouse()"); //$NON-NLS-1$
    }

    @Override
    public void run() {
        System.out.println("Mouse.run()"); //$NON-NLS-1$
    }

    @Override
    public void eat() {
        System.out.println("Mouse.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

class Gerbil1 implements Rodent1 {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description d; //$NON-NLS-1$

    public Gerbil1(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description("Gerbil description", this.shared);
        this.shared.addRef();
    }

    public Gerbil1() {
        print("Gerbil()"); //$NON-NLS-1$
    }

    public void run() {
        System.out.println("Gerbil.run()"); //$NON-NLS-1$
    }

    public void eat() {
        System.out.println("Gerbil.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

class Hamster1 implements Rodent1 {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description d; //$NON-NLS-1$

    public Hamster1() {
        print("Hamster()"); //$NON-NLS-1$
    }

    public Hamster1(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description("Hamster description", this.shared);
        this.shared.addRef();
    }

    @Override
    public void run() {
        System.out.println("Hamster.run()"); //$NON-NLS-1$
    }

    @Override
    public void eat() {
        System.out.println("Hamster.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

public class Exercise7 {
    private static Random rand = new Random();

    public static Rodent1 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse1();
            case 1:
                return new Gerbil1();
            case 2:
                return new Hamster1();
        }
    }

    static public void f(Rodent1[] r) {
        for (Rodent1 rodent : r) {
            rodent.eat();
            rodent.run();
        }
    }

    public static void main(String[] args) {
        Rodent1[] r = new Rodent1[3];
        for (int i = 0; i < r.length; i++) {
            r[i] = next();
        }
        f(r);
    }

}