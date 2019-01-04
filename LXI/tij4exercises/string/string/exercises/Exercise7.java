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
package string.exercises;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(valid("Cfdsafdsafdsa.")); //$NON-NLS-1$
        System.out.println(valid("fdsafdsafdsa.")); //$NON-NLS-1$

    }

    public static boolean valid(String s) {

        return s.matches("^[A-Z].*\\.$"); //$NON-NLS-1$
    }
}
