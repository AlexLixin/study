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
 *    Created on  Dec 28, 2018
 *
 ************************************************************************/
package example;

public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango"; //$NON-NLS-1$
        String s = "abc" + mango + "def" + 47; //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println(s);
    }
} /* Output:
  abcmangodef47
  *///:~