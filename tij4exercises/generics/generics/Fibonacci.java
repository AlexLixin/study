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

import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer> {

    private static int count = 0;

    public Fibonacci() {
    }

    private Integer f(Integer i) {
        if (i < 2)
            return 1;
        return f(i - 1) + f(i - 2);
    }

    @Override
    public Integer next() {
        return f(count++);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci.next()+" ");
        }
    }
}
