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

class Exer11_1 extends Exception {
    private static final long serialVersionUID = 1L;

}

public class Exercise11 {
    static void f() {
        try {
            g();
        } catch (Exer11_1 e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    static void g() throws Exer11_1 {
        throw new Exer11_1();
    }

    public static void main(String[] args) {
        f();
    }
}
