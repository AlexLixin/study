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

import java.util.Formatter;

public class Exercise5 {

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("fdsafa%-15.4f", 1231234545.12313);
        System.out.println();
        f.format("%-15.3sfdsasa", 1231234545);
        System.out.println();
        f.format("%bsfdsasa\n", 1231234545);
        f.format("%-15xfdsfdsafd\n", 1231234545);
    }

}
