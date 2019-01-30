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
 *    Created on  Jan 30, 2019
 *
 ************************************************************************/
package generics.exercises;

import net.mindview.util.SixTuple;
import static net.mindview.util.Tuple.*;

public class Exercise16 {
    static SixTuple<Vehicle, Amphibian, String, Integer, Double, Character> f() {
        return tuple(new Vehicle(), new Amphibian(), new String("hi"), new Integer(47), new Double(11.1), new Character('x'));

    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
