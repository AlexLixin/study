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
 *    Created on  Dec 21, 2018
 *
 ************************************************************************/
package holding.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Exer7{

}
public class Exercise7 {
    public static void main(String[] args) {
        Exer7[] eArray = new Exer7[3];
        for (int i = 0; i < eArray.length; i++) {
            eArray[i] = new Exer7();
        }

        List<Exer7> list = new ArrayList<>(Arrays.asList(eArray));

        List<Exer7> subList = list.subList(0, 1);
        System.out.println(list);
        System.out.println(subList);
        list.removeAll(subList);
        System.out.println(list);

    }
}
