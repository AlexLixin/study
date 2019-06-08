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

import java.util.regex.*;

public class Resetting {
    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags"); //$NON-NLS-1$ //$NON-NLS-2$
        while (m.find())
            System.out.print(m.group() + " "); //$NON-NLS-1$
        System.out.println();
        m.reset("fix the rig with rags"); //$NON-NLS-1$
        while (m.find())
            System.out.print(m.group() + " "); //$NON-NLS-1$
    }
} /* Output:
  fix rug bag
  fix rig rag
  *///:~
