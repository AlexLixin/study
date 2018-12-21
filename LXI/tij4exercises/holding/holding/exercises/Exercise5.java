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
 *    Created on  Dec 21, 2018
 *
 ************************************************************************/
package holding.exercises;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Pet;

public class Exercise5 {
    public static void main(String[] args) {

        Random rand = new Random(47);
        List<Integer> integer = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        print("1: " + integer);
        Integer h = new Integer(10);
        integer.add(h); // Automatically resizes
        print("2: " + integer);
        print("3: " + integer.contains(h));
        integer.remove(h); // Remove by object
        Integer p = integer.get(2);
        print("4: " +  p + " " + integer.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + integer.indexOf(cymric));
        print("6: " + integer.remove(cymric));
        // Must be the exact object:
        print("7: " + integer.remove(p));
        print("8: " + integer);
        integer.add(3, new Integer(13)); // Insert at an index
        print("9: " + integer);
        List<Integer> sub = integer.subList(1, 4);
        print("subList: " + sub);
        print("10: " + integer.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + integer.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + integer.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integer);
        sub = Arrays.asList(integer.get(1), integer.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Integer>(integer); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, new Integer(0)); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + integer.isEmpty());
        integer.clear(); // Remove all elements
        print("19: " + integer);
        print("20: " + integer.isEmpty());
        integer.addAll(Arrays.asList(3,4,5,6,7,9,6));
        print("21: " + integer);
        Object[] o = integer.toArray();
        print("22: " + o[3]);
        Integer[] pa = integer.toArray(new Integer[0]);
        print("23: " + pa[3].byteValue());

    }

}
