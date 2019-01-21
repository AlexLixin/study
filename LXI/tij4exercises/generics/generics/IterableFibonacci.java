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
 *    Created on  Jan 21, 2019
 *
 ************************************************************************/
package generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int i;

    public IterableFibonacci(int i) {
        this.i = i;
    }

    private class FibonacciIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Integer next() {
            i--;
            return IterableFibonacci.this.next();
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }

    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(18);
        for (Integer integer : iterableFibonacci) {
            System.out.println(integer);
        }
    }

}
