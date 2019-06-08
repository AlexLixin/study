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
 *    Created on  Jan 3, 2019
 *
 ************************************************************************/
package string.example;

import java.util.*;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I知 not dead yet! I feel happy!"; //$NON-NLS-1$
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + " "); //$NON-NLS-1$
        System.out.println();
        System.out.println(Arrays.toString(input.split(" "))); //$NON-NLS-1$
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
            System.out.print(scanner.next() + " "); //$NON-NLS-1$
    }
} /* Output:
  But I知 not dead yet! I feel happy!
  [But, I知, not, dead, yet!, I, feel, happy!]
  But I知 not dead yet! I feel happy!
  *///:~