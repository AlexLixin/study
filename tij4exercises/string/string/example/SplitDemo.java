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
import java.util.*;
import static net.mindview.util.Print.*;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("!!").split(input)));
        // Only do the first three:
        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
} /* Output:
  [This, unusual use, of exclamation, points]
  [This, unusual use, of exclamation!!points]
  *///:~