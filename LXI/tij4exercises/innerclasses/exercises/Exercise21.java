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
 *    Created on  Dec 18, 2018
 *
 ************************************************************************/
package exercises;

interface Exer21_1 {
    static class Exer21_2 {
        static public void g(Exer21_1 e) {
            e.f();
        }
    }

    void f();
}

public class Exercise21 {
    public static void main(String[] args) {
        Exer21_1.Exer21_2.g(new Exer21_1() {

            @Override
            public void f() {
                System.out.println("implement!");
            }
        });
    }

}
