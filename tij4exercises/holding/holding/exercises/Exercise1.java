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
import java.util.List;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        super();
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " is hoping");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Gerbil(i));
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).hop();
        }
    }
}
