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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class CharacterNamesGenerator {
    private int i = 0;

    public String next() {
        switch (i++) {
            case 0:
                return "Lincoln"; //$NON-NLS-1$
            case 1:
                return "Trump"; //$NON-NLS-1$
            case 2:
                return "Obama"; //$NON-NLS-1$
            case 3:
                return "Winfrey"; //$NON-NLS-1$
            case 4:
                return "Presley"; //$NON-NLS-1$
            case 5:
                return "Clinton"; //$NON-NLS-1$
            case 6:
                i = 0;
                return "Hepburn"; //$NON-NLS-1$
        }
        return null;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        CharacterNamesGenerator c = new CharacterNamesGenerator();
        String[] s = new String[16];
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 16; i++) {
            String str = c.next();
            s[i] = str;
            arrayList.add(str);
            linkedList.add(str);
            hashSet.add(str);
            linkedHashSet.add(str);
            treeSet.add(str);
        }

        for (String string : s) {
            System.out.println("String[]: " + string);
        }
        for (String string : arrayList) {
            System.out.println("arrayList: " + string);
        }
        for (String string : linkedList) {
            System.out.println("linkedList: " + string);
        }
        for (String string : hashSet) {
            System.out.println("hashSet: " + string);
        }
        for (String string : linkedHashSet) {
            System.out.println("linkedHashSet:" + string);
        }
        for (String string : treeSet) {
            System.out.println("treeSet: " + string);
        }

    }

}
