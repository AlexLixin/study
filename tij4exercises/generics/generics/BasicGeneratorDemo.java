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
package generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> g = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(g.next());
        }

    }
}
