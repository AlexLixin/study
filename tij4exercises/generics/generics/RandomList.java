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

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : ("The quick brown fox jumped over " + "the lazy brown dog").split(" ")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " "); //$NON-NLS-1$
    }
}
