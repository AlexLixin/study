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

public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[] { "Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" }) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            System.out.println("Rudolph".matches(pattern)); //$NON-NLS-1$
    }
} /* Output:
  true
  true
  true
  true
  *///:~
