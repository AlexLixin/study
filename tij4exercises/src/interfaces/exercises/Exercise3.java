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
 *    Created on  Dec 10, 2018
 *
 ************************************************************************/
package interfaces.exercises;

abstract class A {
    abstract void print();

    A() {
        print();
    }
}

class B extends A {
    int i = 456456;

    @Override
    void print() {
        System.out.println(i);
    }

}

public class Exercise3 {
    public static void main(String[] args) {
        /* Process of initialization:
         * 1. Storage for B s allocated and initialized to binary zero
         * 2. A() called
         * 3. B.print() called in A() (s.i = 456456)
         * 4. Member initializers called in order (s.i = 456456)
         * 5. Body of B() called
         */
        B b = new B();
        b.print();
    }
}
