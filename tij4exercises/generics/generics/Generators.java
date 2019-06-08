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
 *    Created on  Jan 25, 2019
 *
 ************************************************************************/
package generics;

//A utility to use with Generators.
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;

    }

    public static void main(String[] args) {
        Collection<Coffee> c = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : c) {
            System.out.println(coffee);
        }

        Collection<Integer> f = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (Integer integer : f) {
            System.out.print(integer + ", "); //$NON-NLS-1$
        }
    }
} /* Output:
  Americano 0
  Latte 1
  Americano 2
  Mocha 3
  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
  *///:~