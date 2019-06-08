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
 *    Created on  Jan 22, 2019
 *
 ************************************************************************/
package generics;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
        System.out.println(petPeople);
    }

    public static void main(String[] args) {
         f(New.map()); // Does not compile
    }
} ///:~