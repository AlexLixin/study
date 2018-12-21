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

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static net.mindview.util.Print.*;

public class Exercise6 {
    public static void main(String[] args) {

        Random rand = new Random();
        List<String> ls = new ArrayList<String>();
        print("0: " + ls); //$NON-NLS-1$
        Collections.addAll(ls, "oh", "what", "a", "beautiful", "Manila", "Monday", "morning"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
        print("1: " + ls); //$NON-NLS-1$
        String h = new String("hi"); //$NON-NLS-1$
        ls.add(h);
        print("2: " + ls); //$NON-NLS-1$
        print("3: " + ls.contains(h)); //$NON-NLS-1$
        // removes the first instance equivalent to String h:
        ls.remove(h);
        print("3.5: " + ls); //$NON-NLS-1$
        String p = ls.size() > 2 ? ls.get(2) : null;
        print("4: " + p + " " + ls.indexOf(p)); //$NON-NLS-1$ //$NON-NLS-2$
        String cy = new String("cy"); //$NON-NLS-1$
        print("5: " + cy + " " + ls.indexOf(cy)); //$NON-NLS-1$ //$NON-NLS-2$
        print("6: " + ls.remove(cy)); //$NON-NLS-1$
        print("7: " + ls.remove(p)); //$NON-NLS-1$
        print("8: " + ls); //$NON-NLS-1$
        if (ls.size() > 3)
            ls.add(3, "wonderful"); //$NON-NLS-1$
        print("9: " + ls); //$NON-NLS-1$
        if (ls.size() < 4) {
            List<String> s = Arrays.asList("let's", "jump", "in", "here"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            ls.addAll(0, s);
        }
        List<String> sub = ls.subList(1, 4);
        print("sublist: " + sub); //$NON-NLS-1$
        print("10: " + ls.containsAll(sub)); //$NON-NLS-1$
        // will also sort sub elements within ls:
        Collections.sort(sub);
        print("sorted sublist: " + sub); //$NON-NLS-1$
        print("11: " + ls.containsAll(sub)); //$NON-NLS-1$
        print("11.25: " + ls); //$NON-NLS-1$
        // will also shuffle sub elements within ls:
        Collections.shuffle(sub, rand);
        print("11.5: " + ls); //$NON-NLS-1$
        print("shuffled sublist: " + sub); //$NON-NLS-1$
        print("12: " + ls.containsAll(sub)); //$NON-NLS-1$
        List<String> copy = new ArrayList<String>(ls);
        print("12.5: " + ls); //$NON-NLS-1$
        if (ls.size() < 5) {
            ls.add("two"); //$NON-NLS-1$
            ls.add("more"); //$NON-NLS-1$
        }
        sub = Arrays.asList(ls.get(1), ls.get(4));
        print("sub: " + sub); //$NON-NLS-1$
        copy.retainAll(sub);
        print("13: " + copy); //$NON-NLS-1$
        copy = new ArrayList<String>(ls);
        copy.remove(2);
        print("14: " + copy); //$NON-NLS-1$
        copy.removeAll(sub);
        print("15: " + copy); //$NON-NLS-1$
        if (copy.size() > 1) // to avoid out of bounds exception
            copy.set(1, "excellent"); //$NON-NLS-1$
        print("16: " + copy); //$NON-NLS-1$
        if (copy.size() > 2)
            copy.addAll(2, sub);
        print("17: " + copy); //$NON-NLS-1$
        print("18: " + ls.isEmpty()); //$NON-NLS-1$
        ls.clear();
        print("19: " + ls); //$NON-NLS-1$
        print("20: " + ls.isEmpty()); //$NON-NLS-1$
        ls.addAll(0, sub);
        ls.addAll(2, sub);
        print("21: " + ls); //$NON-NLS-1$
        Object[] o = ls.toArray();
        print("22: " + o[3]); //$NON-NLS-1$
        String[] sa = ls.toArray(new String[0]);
        print("23: " + sa[3]); //$NON-NLS-1$
    }
}
