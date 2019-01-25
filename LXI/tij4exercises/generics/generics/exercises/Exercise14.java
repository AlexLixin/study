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
 *    Created on  Jan 25, 2019
 *
 ************************************************************************/
package generics.exercises;

import generics.CountedObject;
import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class Exercise14 {

    public static void p(Generator<?> g,int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(g.next());
        }
    }

    public static void main(String[] args) {
        Generator<CountedObject> g = new BasicGenerator<>(CountedObject.class);
        p(g,4);
    }
}
