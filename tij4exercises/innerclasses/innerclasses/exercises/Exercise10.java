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
 *    Created on  Dec 14, 2018
 *
 ************************************************************************/
package innerclasses.exercises;

interface Exer10_1 {
    void f();
}

public class Exercise10 {
    Exer10_1 g() {

        if(true) {


            class Exer10_2 implements Exer10_1 {
                @Override
                public void f() {

                }
            }
            return new Exer10_2();
        }
        return null;


    }

    public static void main(String[] args) {

    }
}
