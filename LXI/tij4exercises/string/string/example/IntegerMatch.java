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

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("5678".matches("-?\\d+")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("+911".matches("-?\\d+")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("+911".matches("(-|\\+)?\\d+")); //$NON-NLS-1$ //$NON-NLS-2$
    }
} /* Output:
  true
  true
  false
  true
  *///:~
