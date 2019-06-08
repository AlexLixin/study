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
 *    Created on  Dec 26, 2018
 *
 ************************************************************************/
package exceptions.exercises;

class Exer10_1 extends Exception {
    private static final long serialVersionUID = 1L;

}
class Exer10_2 extends Exception {
    private static final long serialVersionUID = 1L;

}

public class Exercise10 {
    static void f() throws Exer10_2 {
        try {
            g();
        } catch (Exer10_1 e) {
            e.printStackTrace();
            throw new Exer10_2();
        }
    }

    static void g() throws Exer10_1 {
        throw new Exer10_1();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exer10_2 e) {
            e.printStackTrace();
        }
    }
}
