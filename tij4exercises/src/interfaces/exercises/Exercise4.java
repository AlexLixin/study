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
 *    Created on  Dec 10, 2018
 *
 ************************************************************************/
package interfaces.exercises;

abstract class E4A {
}

class E4B extends E4A {

    void f() {
        System.out.println("f();");
    }
}

abstract class E4A_ {
    abstract void f();
}

class E4B_ extends E4A_ {

    void f() {
        System.out.println("f();");
    }
}

public class Exercise4 {
    static void g(E4A ea) {
        ((E4B)ea).f();
    }
    static void g_(E4A_ ea) {
        ea.f();
    }
    public static void main(String[] args) {
        g(new E4B());
        g_(new E4B_());
    }
}
