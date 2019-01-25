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
package generics.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import generics.Fibonacci;
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

public class Exercise13 {

}

class Generators {

    public static <T> Collection<T> fill(Collection<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static <T> List<T> fill(List<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static <T> Queue<T> fill(Queue<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static <T> Set<T> fill(Set<T> c, Generator<T> g, int n) {
        for (int i = 0; i < n; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static void main(String[] args) {
        List<Coffee> c = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : c) {
            System.out.println(coffee);
        }

        LinkedList<Integer> f = fill(new LinkedList<Integer>(), new Fibonacci(), 12);
        for (Integer integer : f) {
            System.out.print(integer + ", "); //$NON-NLS-1$
        }
    }
}