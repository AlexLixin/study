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

class Exer81{
    class Exer82{
        private int i = 1;
        private void g(){
            System.out.println("g()");
        }
    }

    void f() {
        Exer82 exer82 = new Exer82();
        System.out.println(exer82.i);
        exer82.g();
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        Exer81 exer81 = new Exer81();
        exer81.f();
    }
}
