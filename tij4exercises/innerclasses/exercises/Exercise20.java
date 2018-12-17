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
 *    Created on  Dec 17, 2018
 *
 ************************************************************************/
package exercises;

interface Exer20_1 {
    public static class Exer20_2 {
        void f() {
            System.out.println("f()");
        }
    }
}

public class Exercise20 implements Exer20_1 {
    public static void main(String[] args) {
        Exercise20 exercise20 = new Exercise20();
        new Exer20_1.Exer20_2().f();
        ;
    }
}
