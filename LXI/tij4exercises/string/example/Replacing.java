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
package example;

import static net.mindview.util.Print.*;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        print(s.replaceFirst("f\\w+", "located")); //$NON-NLS-1$ //$NON-NLS-2$
        print(s.replaceAll("shrubbery|tree|herring", "banana")); //$NON-NLS-1$ //$NON-NLS-2$
    }
} /* Output:
  Then, when you have located the shrubbery, you must cut down the
  mightiest tree in the forest... with... a herring!
  Then, when you have found the banana, you must cut down the mightiest
  banana in the forest... with... a banana!
  *///:~
