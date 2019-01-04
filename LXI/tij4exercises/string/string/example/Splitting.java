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
 *    Created on  Jan 2, 2019
 *
 ************************************************************************/
package string.example;

import java.util.*;

public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must " + "cut down the mightiest tree in the forest... " + "with... a herring!"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" "); // Doesn’t have to contain regex chars //$NON-NLS-1$
        split("\\W+"); // Non-word characters //$NON-NLS-1$
        split("n\\W+"); // ‘n’ followed by non-word characters //$NON-NLS-1$
    }
} /* Output:
  [Then,, when, you, have, found, the, shrubbery,, you, must, cut, down,
  the, mightiest, tree, in, the, forest..., with..., a, herring!]
  [Then, when, you, have, found, the, shrubbery, you, must, cut, down,
  the, mightiest, tree, in, the, forest, with, a, herring]
  [The, whe, you have found the shrubbery, you must cut dow, the mightiest
  tree i, the forest... with... a herring!]
  *///:~